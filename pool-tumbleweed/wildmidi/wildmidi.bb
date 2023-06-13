SUMMARY = "Softsynth midi player"
DESCRIPTION = "WildMidi is a software midi player which has a core softsynth library that can \
be used with other applications."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.5"

RPM_NAME = "wildmidi-0.4.5-1.3.aarch64.rpm"
RPM_HASH = "bae7ac20186ba78086e5eefa7cb9bbd0078f55d81d3fe9701eaf26acc80c73ebd2c58631a773c9f2003e1daafe696f881ab91f5e363c515e957dbf96e74dde79"

RPROVIDES:${PN} += "wildmidi \
wildmidi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libWildMidi.so.2()(64bit) \
libWildMidi2 \
libasound.so.2()(64bit) \
libc.so.6()(64bit)"

inherit rpm

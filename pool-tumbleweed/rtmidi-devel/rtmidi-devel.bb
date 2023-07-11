SUMMARY = "Development files for rtmidi"
DESCRIPTION = "C++ library for realtime MIDI input/ouput. \
 \
This package contains header files and libraries needed to develop \
application that use rtmidi."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "rtmidi-devel-5.0.0-1.8.aarch64.rpm"
RPM_HASH = "519e9c8516019b66f7324f1cf73ad8aa73d94a875203f314d4b44359d629831a7d17fbe6d75bf0ce38aca6eb5ad5aed2141707e200945268e2fde95ef4e2a349"

RPROVIDES:${PN} += "pkgconfig-rtmidi \
rtmidi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
librtmidi6 \
pkgconfig-alsa \
pkgconfig-jack"

inherit rpm

SUMMARY = "Softsynth midi player"
DESCRIPTION = "WildMidi is a software midi player which has a core softsynth library that can \
be used with other applications."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.5"

RPM_NAME = "wildmidi-0.4.5-1.4.aarch64.rpm"
RPM_HASH = "e4468a8b4bb1ab8d9bb41001023c964e335a555fe9878347a68775af4a0e171718026afe9dc8a22eb1808a99c724bfcd0b2d261048fcc3796257921509d1381f"

RPROVIDES:${PN} += "wildmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libWildMidi.so.2 \
libWildMidi2 \
libasound.so.2 \
libc.so.6"

inherit rpm

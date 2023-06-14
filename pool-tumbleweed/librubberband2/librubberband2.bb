SUMMARY = "Audio time-stretching and pitch-shifting library"
DESCRIPTION = "Rubber Band is a library and utility program that permits you to change the \
tempo and pitch of an audio recording independently of one another."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "librubberband2-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "7b02d5550734f234bf847a979037016d5eb65bc6ae9df611832861caa7c6b9403f19d7641ae1b9d7ffd752b7eb2930b744f29e8cd960f8330b85d7e72ee89eb4"

RPROVIDES:${PN} += "librubberband.so.2 \
librubberband2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

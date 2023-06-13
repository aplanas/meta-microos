SUMMARY = "Open Adaptive Music library"
DESCRIPTION = "OAML is a library for implementing adaptive music in games. \
This package contains the shared library."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "liboaml1-1.3.4-1.14.aarch64.rpm"
RPM_HASH = "aa4d183d73c54dd3bad286b574816992f9225eb8a026e04b1cb33a9e40bfc9e5910be1359b5a9dcf1f9788b2eccdd75a6989890b4cb54b6e8573506ce0bee1ab"

RPROVIDES:${PN} += "liboaml.so.1()(64bit) \
liboaml1 \
liboaml1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsoxr.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm

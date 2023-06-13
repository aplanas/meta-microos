SUMMARY = "A C99 library for realtime audio input/output"
DESCRIPTION = "This appropriate for games, music players, digital audio workstations, and \
various utilities. \
 \
This package contains the shared library."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "libsoundio2-2.0.0-1.11.aarch64.rpm"
RPM_HASH = "ca6068a06b2d4080bcead8a5826d1a6466e8bd026072cd6eeffcb3556e60ef3f4b491f01b7f82a06aa542602dbdbc417b80f03b475c17b971bc2c88c9874c02c"

RPROVIDES:${PN} += "libsoundio.so.2()(64bit) \
libsoundio2 \
libsoundio2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjack.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm

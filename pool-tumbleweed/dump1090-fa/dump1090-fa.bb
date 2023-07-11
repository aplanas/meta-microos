SUMMARY = "An ADS-B Mode S decoder for RTLSDR devices (Flightaware fork)"
DESCRIPTION = "An ADS-B Mode S decoder specifically designed for RTLSDR devices. \
Flightaware fork."
LICENSE = "GPL-2.0-only"

PV = "8.2"

RPM_NAME = "dump1090-fa-8.2-1.4.aarch64.rpm"
RPM_HASH = "076f615237b698491ba54645744379f6a263c844232fbc20c0f3541b277e59edb2c5f0b715ae403a56e9cbc314c141ba0f2a9814cb14a07ae49f089a6c2a6d83"

RPROVIDES:${PN} += "dump1090-fa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbladeRF.so.2 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
librtlsdr.so.0 \
libtinfo.so.6"

inherit rpm

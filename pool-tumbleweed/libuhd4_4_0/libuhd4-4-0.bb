SUMMARY = "The UHD driver"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "libuhd4_4_0-4.4.0.0-1.5.aarch64.rpm"
RPM_HASH = "837e23b70a457d07cb49ce88f2458d337066342727ad8d0a2939c6677d359406ee5c2f1933d33cb99a30c4dcc607e578f672b48fd75bf9478479e8bc741cefbc"

RPROVIDES:${PN} += "libuhd.so.4.4.0 \
libuhd4-4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-chrono.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
shadow \
uhd-udev"

inherit rpm

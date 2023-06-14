SUMMARY = "The UHD driver"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "libuhd4_4_0-4.4.0.0-1.4.aarch64.rpm"
RPM_HASH = "95f168569c774e1469ec7a712252e065043f4d46b00ccc01fd995c869a0d7d83543ad66ed69789307ccd7c9e39a2e9055fb87be703b6e0003186e20a324422a2"

RPROVIDES:${PN} += "libuhd.so.4.4.0 \
libuhd4-4-0"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-chrono.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
shadow \
uhd-udev"

inherit rpm

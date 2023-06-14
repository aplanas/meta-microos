SUMMARY = "Utility programs for USRP hardware"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains utility programs for handling USRP frontens"
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "uhd-utils-4.4.0.0-1.4.aarch64.rpm"
RPM_HASH = "e582ac639988db0d17b1855b0ec5767e943cbbcefbf497af4323642e55ee59d53e9313e1812db9496d00acc598e2958af6415af36675087ab38ecf8248c1c01f"

RPROVIDES:${PN} += "uhd-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuhd.so.4.4.0 \
python3-uhd"

inherit rpm

SUMMARY = "Utility programs for USRP hardware"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains utility programs for handling USRP frontens"
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "uhd-utils-4.4.0.0-1.5.aarch64.rpm"
RPM_HASH = "7d6ebc5bceafac2964e9b0d2f1ad9b7c85bf397b99c7cbab78d557ca577afc1b05e58e91df59a6a7f902559ea16479b447375d9441e7587b1040f367e151a0c5"

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

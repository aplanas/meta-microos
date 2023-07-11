SUMMARY = "Python bindings for uhd"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains Python bindings UHD."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "python3-uhd-4.4.0.0-1.5.aarch64.rpm"
RPM_HASH = "814c1427f10a0369f78f9875ff77b64e6f09bb84ce2353712231961667512a308f18aea1f313e1e02a96c348aa9c78d90ba9127ba46d3a0c21af34f65e90e4fc"

RPROVIDES:${PN} += "libpyuhd.cpython-311-aarch64-linux-gnu.so \
python3-uhd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libuhd.so.4.4.0 \
python-abi"

inherit rpm

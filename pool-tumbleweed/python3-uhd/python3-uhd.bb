SUMMARY = "Python bindings for uhd"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains Python bindings UHD."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "python3-uhd-4.4.0.0-1.4.aarch64.rpm"
RPM_HASH = "a4a058d1e9937dbebf5c9909b463cf98369ecd3b88f7c305e86717b44102a6dc8de4af6eac5d78ee9a4b46412c84fb1aab18383ca78dac99503d1f0c40845b26"

RPROVIDES:${PN} += "libpyuhd.cpython-310-aarch64-linux-gnu.so \
python3-uhd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libuhd.so.4.4.0 \
python-abi"

inherit rpm

SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the python binidings for YODA."
LICENSE = "GPL-2.0-only"

PV = "1.9.7"

RPM_NAME = "python3-YODA-1.9.7-1.3.aarch64.rpm"
RPM_HASH = "cd71c46e2c2ae4fa20d666722309b6cf3ca0015f8b9dffaf57f283484e84941f5c9977a2fb1ff723c55036f4554992bad697a55610f6871466c8917cc4c48506"

RPROVIDES:${PN} += "python-YODA \
python3-YODA"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libYODA-1-9-7 \
libYODA-1.9.7.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm

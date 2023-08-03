SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the python binidings for YODA."
LICENSE = "GPL-2.0-only"

PV = "1.9.8"

RPM_NAME = "python3-YODA-1.9.8-1.1.aarch64.rpm"
RPM_HASH = "1a1fd416c951b9c77c2583c6c1c89e4fd8c7a6e743aa74ebabc62027175d66ab8b0146e35269cab07f7cc4bfa3c481b98d192bac94e661142089c6a1ea3585a9"

RPROVIDES:${PN} += "python-YODA \
python3-YODA"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libYODA-1-9-8 \
libYODA-1.9.8.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm

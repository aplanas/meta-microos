SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the python binidings for YODA."
LICENSE = "GPL-2.0-only"

PV = "1.9.7"

RPM_NAME = "python3-YODA-1.9.7-1.4.aarch64.rpm"
RPM_HASH = "05aacbf8ff8c0610f665d854af2f4e1edc83d784c713a5b49029fca239ef7173c477d9e52238ca93e30c35e5b19d39f867f602f423642abee447717aef130090"

RPROVIDES:${PN} += "python-YODA \
python3-YODA"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libYODA-1-9-7 \
libYODA-1.9.7.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm

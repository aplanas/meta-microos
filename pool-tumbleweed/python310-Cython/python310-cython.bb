SUMMARY = "The Cython compiler for writing C extensions for the Python language"
DESCRIPTION = "The Cython language allows for writing C extensions for the Python \
language. Cython is a source code translator based on Pyrex, but \
supports more cutting edge functionality and optimizations. \
 \
The Cython language is very close to the Python language (and most Python \
code is also valid Cython code), but Cython additionally supports calling C \
functions and declaring C types on variables and class attributes. This \
allows the compiler to generate very efficient C code from Cython code."
LICENSE = "Apache-2.0"

PV = "3.0.2"

RPM_NAME = "python310-Cython-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "c5024a91e62308874508666d40f21417491f2b813f2397326c8a6591a6930c3a319bec6c4e48626bc15ba698cb1ad42115f39b3b75d1a6a69ffa08e18b302484"

RPROVIDES:${PN} += "python3.10dist-cython \
python310-Cython \
python310-Cython3 \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-devel \
update-alternatives"

inherit rpm

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

PV = "0.29.35"

RPM_NAME = "python39-Cython-0.29.35-1.3.aarch64.rpm"
RPM_HASH = "2c0bcf6ef791cfd6e2c36571a6a6609c574ed8d16f02194a33de901f6f7e9eb98fbad88d600aa40f250addd98598d80d57fb275dbc7a32b6014d007d589d4ca3"

RPROVIDES:${PN} += "python3.9dist-cython \
python39-Cython \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-devel \
python39-xml \
update-alternatives"

inherit rpm

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

PV = "3.0.0~b3"

RPM_NAME = "python311-Cython3-3.0.0~b3-1.3.aarch64.rpm"
RPM_HASH = "cdf4d7bd6b699dab7c25197d47c873b10f83db4fb75c4b847e8f3854706bdee3a1d8d78b8976be8b31dc05fb21c19ffa2ec232f94466c8fab67ea74c157ce959"

RPROVIDES:${PN} += "python3-Cython \
python3-Cython3 \
python3-cython \
python3.11dist-cython \
python311-Cython \
python311-Cython3 \
python311-cython \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-devel \
update-alternatives"

inherit rpm

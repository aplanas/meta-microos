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

PV = "0.29.36"

RPM_NAME = "python311-Cython0-0.29.36-1.1.aarch64.rpm"
RPM_HASH = "e639087874cec7944b9990d2a8954f291c106e4f1470dd249d9d51d64514aaf431b0e227a8b1a48b16ed9a0bc3efbcbb712a58aadea11d37a07a9b0ceccaa19e"

RPROVIDES:${PN} += "python3-Cython \
python3-Cython0 \
python3-cython \
python3.11dist-cython \
python311-Cython \
python311-Cython0 \
python311-cython \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-devel \
python311-xml \
update-alternatives"

inherit rpm

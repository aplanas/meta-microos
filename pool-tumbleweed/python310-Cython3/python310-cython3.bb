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

RPM_NAME = "python310-Cython3-3.0.0~b3-1.3.aarch64.rpm"
RPM_HASH = "bafe2b6861100f5a836f91f8fdf20401d988ad1fccfa58f9f7a8739507b19462cdc623735b64760ed773955132c90842e14b8a46a7f59bdf8f504647522e362a"

RPROVIDES:${PN} += "python3.10dist-cython \
python310-Cython \
python310-Cython3 \
python310-cython \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-devel \
update-alternatives"

inherit rpm

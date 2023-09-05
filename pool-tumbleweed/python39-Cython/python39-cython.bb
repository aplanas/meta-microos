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

RPM_NAME = "python39-Cython-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "1e2f1203ca5d6129ac9cb19544f7f7ef9db976853d8a26c420ec9c4634c3939ae9ac927b3021025dff5c6eb595b11c2261bd55fc06c398bf7ffe8a9bdb9b6454"

RPROVIDES:${PN} += "python3.9dist-cython \
python39-Cython \
python39-Cython3 \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-devel \
update-alternatives"

inherit rpm

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

RPM_NAME = "python39-Cython3-3.0.0~b3-1.3.aarch64.rpm"
RPM_HASH = "e10b55f9ef14b94316030f6e3b0856ed050955054ddfb1477bc2d944c2d0cad778447a67d3a1df2d80bfab4f2827358d4ade208f8c0acd5d414f1ceae92a1790"

RPROVIDES:${PN} += "python3.9dist-cython \
python39-Cython \
python39-Cython3 \
python39-cython \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-devel \
update-alternatives"

inherit rpm

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

RPM_NAME = "python310-Cython-0.29.35-1.3.aarch64.rpm"
RPM_HASH = "d6d85da3534666d120f66d5f595e73d3c53f15a37d6486074aef1b5de946a897893e40a63121edfb16e7d80d126d38cba59dfab6cf15fe2754bf48327fb5d94e"

RPROVIDES:${PN} += "python3.10dist-cython \
python310-Cython \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-devel \
python310-xml \
update-alternatives"

inherit rpm

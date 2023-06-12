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

RPM_NAME = "python310-Cython-0.29.35-1.1.aarch64.rpm"
RPM_HASH = "008c8bdde63befcb0eeb1c83e5341c4e5e96c1af78073ef10fe3f353b7cd13b2fc6bd816a29bc1f18f64042f5a073e41b2500ea1814fff07a0075d6339c768d7"

RPROVIDES:${PN} += "python3-Cython \
python3.10dist(cython) \
python310-Cython \
python310-Cython(aarch-64) \
python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-devel \
python310-xml \
update-alternatives"

inherit rpm

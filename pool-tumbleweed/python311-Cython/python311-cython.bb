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

RPM_NAME = "python311-Cython-0.29.36-1.1.aarch64.rpm"
RPM_HASH = "099fdd30887d754a7db175ee61dd090f6a5c1af36954aa97ffeb2a0ff462bb78f244a12923edf0c2eace7bbb45fb91cb2b9cf6ac25016305629464acdfc97004"

RPROVIDES:${PN} += "python3-Cython \
python3.11dist-cython \
python311-Cython \
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

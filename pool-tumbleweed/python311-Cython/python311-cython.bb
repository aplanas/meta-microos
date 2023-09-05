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

RPM_NAME = "python311-Cython-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "2373506ea30c2cf46df2015c66fa162d58656479066417871e6a57816932b24487b05f4af769856b0fb9a69a47602671a1e0f5ca871639b3615964b9f8ffdc61"

RPROVIDES:${PN} += "python3-Cython \
python3-Cython3 \
python3.11dist-cython \
python311-Cython \
python311-Cython3 \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-devel \
update-alternatives"

inherit rpm

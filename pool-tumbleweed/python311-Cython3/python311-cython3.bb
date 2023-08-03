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

PV = "3.0.0"

RPM_NAME = "python311-Cython3-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "7f58f7250c6ea3e1d0b584891dd62f37830ebc9e5b7ffa8ad0de9d9269489f7bf6ead2cf40fda88fc3fd85614f3501107eb89e23eeb07354d687e7adb2343bc6"

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

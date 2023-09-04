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

RPM_NAME = "python39-Cython-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "f7895f665880464bb2619e5db55b131e28aaa5e83cf8a0f15fae37e847d7db81644c4c3ef494e737b58351c354c1a793a77a94b1e70ebd23ddbbd3468a52776f"

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

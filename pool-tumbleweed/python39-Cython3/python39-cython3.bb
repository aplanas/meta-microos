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

RPM_NAME = "python39-Cython3-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "65a4e5e0bc9bb4390eb17fe482d1d0d309194396e737b1b694565c9f4c88409a8ace80bcc0494085312e3243a638c9756ae992d4b0110678ac8dc69d5e4c153e"

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

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

RPM_NAME = "python39-Cython-0.29.36-1.1.aarch64.rpm"
RPM_HASH = "4607a4af4f5fa021a1e86f097760ee95139ddfaed9f56012443aa28c03121573d52fa29eefdbc3887f17062373440ca08fb49376a0924633302f3a1cf2dde178"

RPROVIDES:${PN} += "python3.9dist-cython \
python39-Cython \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-devel \
python39-xml \
update-alternatives"

inherit rpm

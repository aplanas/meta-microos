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

RPM_NAME = "python310-Cython-0.29.36-1.1.aarch64.rpm"
RPM_HASH = "7d928e94b5c80ac82f9f3406848d249a4013a667edff2d4608903acc49dff5885751a8ec3fa507a8364f154f9475e96be936dc8316172cfeb85841918f49bd87"

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

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

RPM_NAME = "python310-Cython0-0.29.36-1.1.aarch64.rpm"
RPM_HASH = "542a2173213cc1eb9ac2e8e7f614b6f042c1200c0131902b58368998cdcda5e81721ad554813d6bc39a5fd496050b66fdce65b6f61bd442199137bd05418e70d"

RPROVIDES:${PN} += "python3.10dist-cython \
python310-Cython \
python310-Cython0 \
python310-cython \
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

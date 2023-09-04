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

RPM_NAME = "python39-Cython0-0.29.36-1.1.aarch64.rpm"
RPM_HASH = "0ca80fe6f57b1ba5b30ad3a4ed9f1cfe0ba57461493e3ce3f1279af10c5370a3b87fd6cb94a19afe210a0db76d254eb53f906bf91697a479edfc6dadbbc733d6"

RPROVIDES:${PN} += "python3.9dist-cython \
python39-Cython \
python39-Cython0 \
python39-cython \
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

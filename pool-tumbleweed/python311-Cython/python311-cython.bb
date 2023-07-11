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

RPM_NAME = "python311-Cython-0.29.35-1.3.aarch64.rpm"
RPM_HASH = "1af35eaed47312673001d989bc600f2ef469604cbef96172334f2534e5945e66a8af48f9bfcc7afb1ecf2cf849776c27609eadd67a650a2e9fce7eea0b480831"

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

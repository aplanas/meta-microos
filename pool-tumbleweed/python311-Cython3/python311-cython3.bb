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

PV = "3.0.0~b3"

RPM_NAME = "python311-Cython3-3.0.0~b3-1.1.aarch64.rpm"
RPM_HASH = "c013a70dc22fa37a74cdcec2739647232d0ce7cec11614a7cf1bb1c506255fcab66a3092647bbb34df570d1de662217cb0ce040a27ab4021d6377b018c31f15b"

RPROVIDES:${PN} += "python3.11dist(cython) \
python311-Cython \
python311-Cython3 \
python311-Cython3(aarch-64) \
python311-cython \
python3dist(cython)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python311-devel \
update-alternatives"

inherit rpm

SUMMARY = "CMU-Cambridge Statistical Language Modeling toolkit"
DESCRIPTION = "The CMU-Cambridge Language Modeling Toolkit is a free set of tools \
for constructing and testing statistical N-Gram language models. \
These models have various applications including speech recognition, \
machine translation, optical character and handwriting recognition. \
 \
This package contains the front-end tools for easy language model \
training as well as the basic tools for manipulating N-Gram and text files."
LICENSE = "AFL-2.1 & BSD-3-Clause"

PV = "0.7"

RPM_NAME = "cmuclmtk-0.7-11.21.aarch64.rpm"
RPM_HASH = "16a0d1d7fc2024d68ae3c3a2327a001b82a9303301b9d6f06adc79af93f1488ce9b5a00aff9cfd59c2f9a6feb0cb8f345ed9e0d799e0806c1d1f6fbdd20371d7"

RPROVIDES:${PN} += "cmuclmtk \
cmuclmtk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcmuclmtk.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

SUMMARY = "CMU-Cambridge Statistical Language Modeling toolkit"
DESCRIPTION = "The CMU-Cambridge Language Modeling Toolkit is a free set of tools \
for constructing and testing statistical N-Gram language models. \
These models have various applications including speech recognition, \
machine translation, optical character and handwriting recognition. \
 \
This package contains the shared library used by the CMU-Cambridge \
Language Model Toolkit."
LICENSE = "AFL-2.1 & BSD-3-Clause"

PV = "0.7"

RPM_NAME = "libcmuclmtk0-0.7-11.22.aarch64.rpm"
RPM_HASH = "296fd1c276da5ceb5eea7dc2076a20f734c5115456578b5d534b59c99ac22bf89b5af2b3c3340c7cb659f73ad0fdf7d6a164258cd1d002122873da4f6e9d6281"

RPROVIDES:${PN} += "libcmuclmtk.so.0 \
libcmuclmtk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

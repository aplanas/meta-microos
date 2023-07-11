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

RPM_NAME = "cmuclmtk-0.7-11.22.aarch64.rpm"
RPM_HASH = "ac9671505cfd37634d7e266740585af407f451f4d6bee8ed4223565f9a865a6d6b06013f0339f275ef7d0e2bff9605774fae09e53bdf3575343dda47d2de98f2"

RPROVIDES:${PN} += "cmuclmtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcmuclmtk.so.0 \
libm.so.6"

inherit rpm

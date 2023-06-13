SUMMARY = "CMU-Cambridge Statistical Language Modeling toolkit"
DESCRIPTION = "The CMU-Cambridge Language Modeling Toolkit is a free set of tools \
for constructing and testing statistical N-Gram language models. \
These models have various applications including speech recognition, \
machine translation, optical character and handwriting recognition. \
 \
This package contains the include files and libraries used to compile \
programs using the CMU-Cambridge Language Model Toolkit."
LICENSE = "AFL-2.1 & BSD-3-Clause"

PV = "0.7"

RPM_NAME = "libcmuclmtk-devel-0.7-11.21.aarch64.rpm"
RPM_HASH = "20d5ce8a39302d1755c90ecd8c872f6752ce78a5e7f317d22b1cf283e40c5041ca1795d860b23c2bd3d9a49b4573870ce86a8aeb18496f2d429b0c167cdb5650"

RPROVIDES:${PN} += "libcmuclmtk-devel \
libcmuclmtk-devel(aarch-64)"

RDEPENDS:${PN} += "cmuclmtk \
libcmuclmtk0"

inherit rpm

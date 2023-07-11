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

RPM_NAME = "libcmuclmtk-devel-0.7-11.22.aarch64.rpm"
RPM_HASH = "8676c6dc80e90ec9dd9a38a5c34927d6954dccaac01e370fb9a8056649e7b688748b865d79285edd21b0b711b0a968bf5086e75c7dd8a0194e1c437e7ad92127"

RPROVIDES:${PN} += "libcmuclmtk-devel"

RDEPENDS:${PN} += "cmuclmtk \
libcmuclmtk0"

inherit rpm

SUMMARY = "Unsupervised and semi-supervised morphological segmentation"
DESCRIPTION = "Morfessor is a tool for unsupervised and semi-supervised \
morphological segmentation"
LICENSE = "BSD-2-Clause"

PV = "2.0.6"

RPM_NAME = "python311-Morfessor-2.0.6-2.14.noarch.rpm"
RPM_HASH = "2870b1ba1bd8e1ce5b9548457c24c479983d3d7cd43ae2b08a3d5536e63687098fb7eb36555f87f4b0331e1da06af606460711b37f14027e0341f18d0ce0e514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Morfessor \
python3.11dist-morfessor \
python311-Morfessor \
python3dist-morfessor"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

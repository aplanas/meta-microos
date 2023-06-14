SUMMARY = "Unsupervised and semi-supervised morphological segmentation"
DESCRIPTION = "Morfessor is a tool for unsupervised and semi-supervised \
morphological segmentation"
LICENSE = "BSD-2-Clause"

PV = "2.0.6"

RPM_NAME = "python311-Morfessor-2.0.6-2.13.noarch.rpm"
RPM_HASH = "6e2bd24d79deb4d288ec42f82973ed0d4415ec2b010ad0bb462c1590ae2765802266ec80b6c0d7fd59f16fc1e328ff6a11b66725e233d6db729cb55e6c552139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-morfessor \
python311-Morfessor \
python3dist-morfessor"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm

SUMMARY = "Unsupervised and semi-supervised morphological segmentation"
DESCRIPTION = "Morfessor is a tool for unsupervised and semi-supervised \
morphological segmentation"
LICENSE = "BSD-2-Clause"

PV = "2.0.6"

RPM_NAME = "python39-Morfessor-2.0.6-2.13.noarch.rpm"
RPM_HASH = "d456237e349c68f9e161d17095b6f0ed91eb602905cd038ccac2ee062e0d11adb8a91be787160369cc78cd51b242955506933006b2edbc92618fd9edaf86adba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-morfessor \
python39-Morfessor \
python3dist-morfessor"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

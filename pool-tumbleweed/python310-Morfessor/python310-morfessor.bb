SUMMARY = "Unsupervised and semi-supervised morphological segmentation"
DESCRIPTION = "Morfessor is a tool for unsupervised and semi-supervised \
morphological segmentation"
LICENSE = "BSD-2-Clause"

PV = "2.0.6"

RPM_NAME = "python310-Morfessor-2.0.6-2.14.noarch.rpm"
RPM_HASH = "66019c6b8e6a7e7302f26108b9cce4d45912bb7a27bb5b303f642b7f60cdd60463a60dbca519a4de1d93daf6c4415fc78d360eef1f5f92b328945308482a19d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-morfessor \
python310-Morfessor \
python3dist-morfessor"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

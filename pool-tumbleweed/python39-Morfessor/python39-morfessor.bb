SUMMARY = "Unsupervised and semi-supervised morphological segmentation"
DESCRIPTION = "Morfessor is a tool for unsupervised and semi-supervised \
morphological segmentation"
LICENSE = "BSD-2-Clause"

PV = "2.0.6"

RPM_NAME = "python39-Morfessor-2.0.6-2.14.noarch.rpm"
RPM_HASH = "faf9c124b049edb17aa76c3e8e9dac5f8a577e99ce490b8aff2343987585c511cf52ce6625f3d218a0202146cb717fbed761e904a2a7973385bd423ef8fca8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-morfessor \
python39-Morfessor \
python3dist-morfessor"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm

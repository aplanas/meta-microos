SUMMARY = "Python IDE for beginners"
DESCRIPTION = "Thonny is a Python IDE meant for learning programming."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "thonny-4.0.2-1.3.noarch.rpm"
RPM_HASH = "e3b8eb7020fadef3a1aebda348fd9317b4dcf63b31963d34e595a07a2a5f525401b944d7ea1d1e6085c264f62a9b0b06886231e52e6a4d285424491cb98bdb9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-thonny \
python3dist-thonny \
thonny"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
desktop-file-utils \
mypy \
python-abi \
python3-Send2Trash \
python3-astroid \
python3-asttokens \
python3-docutils \
python3-jedi \
python3-pylint \
python3-pyserial \
python3-tk"

inherit rpm

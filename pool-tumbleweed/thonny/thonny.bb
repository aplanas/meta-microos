SUMMARY = "Python IDE for beginners"
DESCRIPTION = "Thonny is a Python IDE meant for learning programming."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "thonny-4.1.1-1.1.noarch.rpm"
RPM_HASH = "1a8cb61d3a9fa392a8d82fa30ff4c3c06ca8dac84f0638b2185684ae0b8474741b64a4730d34365eb803e98a3656feb017edb7ddd4170778cb60cadd1401aa24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-thonny \
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

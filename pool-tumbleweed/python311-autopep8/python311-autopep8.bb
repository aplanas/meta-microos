SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-autopep8-2.0.2-1.4.noarch.rpm"
RPM_HASH = "2f7f0712c7f0b0e6bdf1d6cea22faa5d65e768611d8d61aa7776e0881e13ed13d06549e11be57b18c9950a13155acca1aeaf939f41d8f3375135b2e54a5e3a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autopep8 \
python3.11dist-autopep8 \
python311-autopep8 \
python3dist-autopep8"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pycodestyle \
update-alternatives"

inherit rpm

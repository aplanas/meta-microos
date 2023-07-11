SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-autopep8-2.0.2-1.4.noarch.rpm"
RPM_HASH = "fcf504dbf7a12596b471a2bd244e53a00a466c7bca24e95dacfc16ac3f07f58a96186809118334d57430c78114690a5d396244f94a817518e1fe8c22197d387e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-autopep8 \
python310-autopep8 \
python3dist-autopep8"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pycodestyle \
python310-tomli \
update-alternatives"

inherit rpm

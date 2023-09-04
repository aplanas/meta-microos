SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-autopep8-2.0.2-2.1.noarch.rpm"
RPM_HASH = "9b71aa01dece88d8b92d441e24497e643e92f10c324a49877021e3e3b78d55e7566e97a4cfe7f3fbc29af0d4902c2c1c569164e81db007239457f10cfa7f6fcc"
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

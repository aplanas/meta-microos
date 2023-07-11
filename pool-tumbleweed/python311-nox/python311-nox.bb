SUMMARY = "Flexible test automation"
DESCRIPTION = "Flexible test automation."
LICENSE = "Apache-2.0"

PV = "2023.4.22"

RPM_NAME = "python311-nox-2023.4.22-2.1.noarch.rpm"
RPM_HASH = "90b4b6bc4393489f6847c2a00dded7bf3bd02079c659bb48fe0032e232f4500cd4cbf86030345bc9289f4cef6330169c9662aa277efc8cf4c9bd0eb40ae593b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nox \
python3.11dist-nox \
python311-nox \
python3dist-nox"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-argcomplete \
python311-colorlog \
python311-setuptools \
python311-virtualenv \
update-alternatives"

inherit rpm

SUMMARY = "Convert various requirements-type files to use with pip-tools"
DESCRIPTION = "A simple wrapper around pip to support requirements.txt, Pipenv and Poetry files for containerized applications"
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.5"

RPM_NAME = "python310-micropipenv-1.4.5-1.6.noarch.rpm"
RPM_HASH = "98aeef51e690e4c2c8660aa63457f9ec2ba781f89c3355b6f2838aa42fb6c97ae81775f23f7100e804453ec180abbcc7f87b30f2e458d114541e5947ffa576ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-micropipenv \
python310-micropipenv \
python3dist-micropipenv"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pip \
update-alternatives"

inherit rpm

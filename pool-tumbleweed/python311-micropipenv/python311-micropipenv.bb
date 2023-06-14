SUMMARY = "Convert various requirements-type files to use with pip-tools"
DESCRIPTION = "A simple wrapper around pip to support requirements.txt, Pipenv and Poetry files for containerized applications"
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.5"

RPM_NAME = "python311-micropipenv-1.4.5-1.4.noarch.rpm"
RPM_HASH = "03a4a259d9cc901480335855a9d9905122449bb7f01f71178b2e877ac70b8eb6fbb766a44b9ca074b2e6275c6f69130893f54a482fc1fef2650b70a756540d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-micropipenv \
python311-micropipenv \
python3dist-micropipenv"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-pip \
update-alternatives"

inherit rpm

SUMMARY = "Tool to keep pinned dependencies up to date"
DESCRIPTION = "pip-tools keeps pinned dependencies inside a project up to date."
LICENSE = "BSD-3-Clause"

PV = "7.3.0"

RPM_NAME = "python311-pip-tools-7.3.0-1.1.noarch.rpm"
RPM_HASH = "de53be60ba31585ad1cfb306f8697e1d54d0c891482f8647db4bc3945ad517bab5586958f493659a5cbc623e2674a83ac3e682e19a32088e4132c5accfe00792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-tools \
python3.11dist-pip-tools \
python311-pip-tools \
python3dist-pip-tools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-build \
python311-click \
python311-pip \
python311-setuptools \
python311-tomli-w \
python311-wheel"

inherit rpm

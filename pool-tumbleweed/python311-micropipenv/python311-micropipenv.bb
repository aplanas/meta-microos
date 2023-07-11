SUMMARY = "Convert various requirements-type files to use with pip-tools"
DESCRIPTION = "A simple wrapper around pip to support requirements.txt, Pipenv and Poetry files for containerized applications"
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.5"

RPM_NAME = "python311-micropipenv-1.4.5-1.6.noarch.rpm"
RPM_HASH = "36ff6bff452f47d4a0e4e8c096430f2927881b925db65a55ac4a8de0fde28c099fb246d4b39c1441f4193f589cf7a7d00e2184eca6ae75f424bd4b1d7b23e6a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-micropipenv \
python3.11dist-micropipenv \
python311-micropipenv \
python3dist-micropipenv"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pip \
update-alternatives"

inherit rpm

SUMMARY = "Interrogate a codebase for docstring coverage"
DESCRIPTION = "Interrogate a codebase for docstring coverage."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-interrogate-1.5.0-1.6.noarch.rpm"
RPM_HASH = "399175f7bb8bb0cc5ccfe6cf01fb35f8b0867436f0ba5af90c16ef7e58eb55ac473c4b58b11775ee358d84e6e00037607e8c53a14e1368146234bd295f607d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-interrogate \
python310-interrogate \
python3dist-interrogate"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-attrs \
python310-click \
python310-colorama \
python310-py \
python310-tabulate \
python310-toml \
update-alternatives"

inherit rpm

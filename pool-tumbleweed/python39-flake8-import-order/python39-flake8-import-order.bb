SUMMARY = "Flake8 plugin that checks the ordering of import statements"
DESCRIPTION = "Flake8 and pylama plugin that checks the ordering of import statements."
LICENSE = "LGPL-3.0-only"

PV = "0.18.2"

RPM_NAME = "python39-flake8-import-order-0.18.2-1.4.noarch.rpm"
RPM_HASH = "4784f2927ecb7f7f124ca2f26d7f65d77ad683d72105fcda35cee0be3452602f50a228fbfe21d02c6b1d57d186eca8f892745b86e0c6f639b65e65e52d44dec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-import-order) \
python39-flake8-import-order \
python3dist(flake8-import-order)"

RDEPENDS:${PN} += "python(abi) \
python39-flake8 \
python39-pycodestyle"

inherit rpm

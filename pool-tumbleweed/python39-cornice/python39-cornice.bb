SUMMARY = "Define Web Services in Pyramid"
DESCRIPTION = "Provides helpers to build & document Web Services with Pyramid."
LICENSE = "MPL-2.0"

PV = "6.0.1"

RPM_NAME = "python39-cornice-6.0.1-1.8.noarch.rpm"
RPM_HASH = "026eece7bda273fb7f59181ab3de3ec7d9ff0b6217ebf48db8385ee7c938b758019d213ce665d4e2559c6dbd32a11af58935d7f5ea7dfeab0e17991a9aa92ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cornice \
python39-cornice \
python3dist-cornice"

RDEPENDS:${PN} += "python-abi \
python39-pyramid \
python39-venusian"

inherit rpm

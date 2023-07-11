SUMMARY = "Define Web Services in Pyramid"
DESCRIPTION = "Provides helpers to build & document Web Services with Pyramid."
LICENSE = "MPL-2.0"

PV = "6.0.1"

RPM_NAME = "python311-cornice-6.0.1-1.8.noarch.rpm"
RPM_HASH = "ebd7f472f1fb0ff02b7b563e5050f36c858ae1604d0db2c20d48e4f150b6f3e796c71e82a7388901e3865f67543c752daf5b46725189d5c4f6ed064f8d1a5b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cornice \
python3.11dist-cornice \
python311-cornice \
python3dist-cornice"

RDEPENDS:${PN} += "python-abi \
python311-pyramid \
python311-venusian"

inherit rpm

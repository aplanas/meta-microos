SUMMARY = "Backend used by PDM"
DESCRIPTION = "The build backend used by [PDM] that supports latest packaging standards."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-pdm-backend-2.1.0-2.1.noarch.rpm"
RPM_HASH = "44163b96ba389ac49e0f7bb54379838755cafe9ecdd2345c7c2086f548329577aae0a2364ef3e7e1d828cf9d31510ed48e5221ad0c72a842431f4b9c7eae8f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdm-backend \
python3.11dist-pdm-backend \
python311-pdm-backend \
python3dist-pdm-backend"

RDEPENDS:${PN} += "python-abi \
python311-importlib-metadata"

inherit rpm

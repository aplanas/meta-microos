SUMMARY = "Backend used by PDM"
DESCRIPTION = "The build backend used by [PDM] that supports latest packaging standards."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-pdm-backend-2.1.0-2.1.noarch.rpm"
RPM_HASH = "26732a2058f77498d5adcbabc71004fb9b0ae7a60cffce2f2daaa4a9729e2d28e41b4f2816935ea52fa12e2dcf7925fcd40460e389ac9e7f53f9f27e1c9b34d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pdm-backend \
python310-pdm-backend \
python3dist-pdm-backend"

RDEPENDS:${PN} += "python-abi \
python310-importlib-metadata"

inherit rpm

SUMMARY = "Have a single source of version in your code base"
DESCRIPTION = "Utility to let you have a single source of version in your code base."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-single-version-1.5.1-1.11.noarch.rpm"
RPM_HASH = "14afc103188e130fa7621536b567495e64d5bf8326546f329a49766e17e8d84d22da886e5395ed7a50600e6e389f97f027d1c51cda96e40e26145d9ded1a5698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-single-version \
python310-single-version \
python3dist-single-version"

RDEPENDS:${PN} += "python-abi \
python310-first \
python310-importlib-metadata"

inherit rpm

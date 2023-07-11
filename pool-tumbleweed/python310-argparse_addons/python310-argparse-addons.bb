SUMMARY = "Additional argparse types and actions"
DESCRIPTION = "Additional argparse types and actions."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python310-argparse_addons-0.12.0-1.3.noarch.rpm"
RPM_HASH = "cdea981e262087f4d9f2d8023a254ef7ec04e1216ff1ce21c42fde3dac09c8392af3ce8008096f73ca1ed11aa79d593d22beea9ef5ff1141c5e2b2a6770ed0ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-argparse-addons \
python310-argparse-addons \
python3dist-argparse-addons"

RDEPENDS:${PN} += "python-abi"

inherit rpm

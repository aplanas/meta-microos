SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-sphinx-argparse-0.4.0-1.3.noarch.rpm"
RPM_HASH = "fda5adb9bff09da8f37672bc09c51a58afc0260abae8fa4a9d9b21261e5f91f4997874f61ace265e0d7587156b9f90e25e63d4b97ed1b89bdbada68ceb6ec496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-argparse \
python3.11dist-sphinx-argparse \
python311-sphinx-argparse \
python3dist-sphinx-argparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm

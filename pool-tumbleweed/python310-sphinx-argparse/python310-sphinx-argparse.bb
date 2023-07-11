SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-sphinx-argparse-0.4.0-1.3.noarch.rpm"
RPM_HASH = "1262576e499b62dbdb87a31d3e9178f0dbf54a89c2ca63cc20b4e467711083718d0f6b18f59c724de942b62f7859367bc139d6cffb49c3acf04558755a39d72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-argparse \
python310-sphinx-argparse \
python3dist-sphinx-argparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm

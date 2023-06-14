SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-sphinx-argparse-0.4.0-1.1.noarch.rpm"
RPM_HASH = "d3ef94eabb00aadc3353a66135b84095dc31faf9c755367d6d86f53a6717e6c2c340063bdddd71b371d1b721e17bbdad7f907db6cfc9851b23a2b766627fe843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-argparse \
python311-sphinx-argparse \
python3dist-sphinx-argparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm

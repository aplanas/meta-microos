SUMMARY = "Python video metadata parser"
DESCRIPTION = "Enzyme is a Python module to parse video metadata."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python310-enzyme-0.4.1-4.14.noarch.rpm"
RPM_HASH = "be5275cca23108b3f26c160157b73823ded6814141ecc7f492c1c3278f33d9b87e4b299f101a9b8ce2532258abf77e1945bd1fc63d85bff3ce867617af2ed8e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-enzyme \
python310-enzyme \
python3dist-enzyme"

RDEPENDS:${PN} += "python-abi"

inherit rpm

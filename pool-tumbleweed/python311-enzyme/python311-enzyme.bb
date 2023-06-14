SUMMARY = "Python video metadata parser"
DESCRIPTION = "Enzyme is a Python module to parse video metadata."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python311-enzyme-0.4.1-4.13.noarch.rpm"
RPM_HASH = "c0273bbca07db8cfa0bbc66bc2033c7cf262bc85d558d2eb3cfaa87c3ff418d37cc77c7d67836ef439a66696b1b5b7b099528f7da75b225ebf421ac9bde80285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-enzyme \
python311-enzyme \
python3dist-enzyme"

RDEPENDS:${PN} += "python-abi"

inherit rpm

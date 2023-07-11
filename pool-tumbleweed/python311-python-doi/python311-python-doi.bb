SUMMARY = "Python package to work with Document Object Identifier (doi)"
DESCRIPTION = "Python package to work with Document Object Identifier (doi)"
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python311-python-doi-0.2.0-1.5.noarch.rpm"
RPM_HASH = "caa7e898206217b740fabceafc3cf26ba8abbcaac2a814e998e838cc7ee2ea0761b545024be21d737f12c99c4f0ba0b0f1cfcec7b71d060dd85ce63596418986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-doi \
python3.11dist-python-doi \
python311-python-doi \
python3dist-python-doi"

RDEPENDS:${PN} += "python-abi"

inherit rpm

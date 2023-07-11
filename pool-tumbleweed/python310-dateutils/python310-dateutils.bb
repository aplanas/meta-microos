SUMMARY = "Python library for working with date and datetime objects"
DESCRIPTION = "Python library for working with date and datetime objects."
LICENSE = "0BSD"

PV = "0.6.12"

RPM_NAME = "python310-dateutils-0.6.12-2.1.noarch.rpm"
RPM_HASH = "f0ef2e023f25bfc6e2d5a4aa6ac89bc0fe380ce6e20e8ce7687c6d100a53a0b2018e3d3f9fdcb438082b1698720ed0066a8d2ea6e9322bea21f9a7da1e06dad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dateutils \
python310-dateutils \
python3dist-dateutils"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil \
python310-pytz"

inherit rpm

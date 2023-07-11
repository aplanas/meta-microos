SUMMARY = "Utilities not included with the standard Python install"
DESCRIPTION = "Python Utils is a collection of Python functions and \
classes which make common patterns shorter and easier."
LICENSE = "BSD-3-Clause"

PV = "3.4.5"

RPM_NAME = "python311-python-utils-3.4.5-1.5.noarch.rpm"
RPM_HASH = "74bb82de4e5d76b068d34614fa38248333eccece933e6135c8ad2c25a682dda62ca72f751814f421620674a0d566564ad3d380228353204bc6c0d68b37cdfca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-utils \
python3.11dist-python-utils \
python311-python-utils \
python3dist-python-utils"

RDEPENDS:${PN} += "python-abi \
python311-loguru"

inherit rpm

SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python310-beartype-0.14.1-1.3.noarch.rpm"
RPM_HASH = "9b3fda9f054307bd8e4863abff55499aa3ed4cd26f9e0519114d7a382cbd404d57c7b20c29ea0801fc0527c01afc12b1132b2dfd7b9c6bc53b03819b32c1d463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-beartype \
python310-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm

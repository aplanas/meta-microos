SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python311-beartype-0.14.1-1.3.noarch.rpm"
RPM_HASH = "1307629062e22aa1c95402df883c0d60f01066f5162630ab81ebb59803853859a435259beebd868fa5488e92abe75ed131658b3ed8010de6d3cad84394de1a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-beartype \
python3.11dist-beartype \
python311-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm

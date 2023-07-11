SUMMARY = "Microsoft Azure Data Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Data namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.data namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-data-nspkg-1.0.0-2.12.noarch.rpm"
RPM_HASH = "c67177fa2bc4bae67057c6529acf985bd142d7dbfde2f06ded9ca56e630c08cc645de977b66634db16cdd7d81aa3aeb6e34b6ddcc622391b603ade380fee8548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-data-nspkg \
python3.11dist-azure-data-nspkg \
python311-azure-data-nspkg \
python3dist-azure-data-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm

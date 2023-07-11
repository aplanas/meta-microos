SUMMARY = "Microsoft Azure Data Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Data namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.data namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-data-nspkg-1.0.0-2.12.noarch.rpm"
RPM_HASH = "3c25ce3854d68fe08d3a99fdc1a9d5517e94d57cfe83bf145f69de75acdc53dcc1ad156d08b56ebd55a23f62bb5d6cff57af51f88bb49c8f410bfc1069b58309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-data-nspkg \
python39-azure-data-nspkg \
python3dist-azure-data-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm

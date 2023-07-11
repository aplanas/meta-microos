SUMMARY = "Microsoft Azure Data Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Data namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.data namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-data-nspkg-1.0.0-2.12.noarch.rpm"
RPM_HASH = "d0b7de2a37ba0a466abc082e5112c55743a3d1826198901f2395f4a1b18d5632b8934734c20305eac310757809bd336676d51ef911f80c785ca171182a550c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-data-nspkg \
python310-azure-data-nspkg \
python3dist-azure-data-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm

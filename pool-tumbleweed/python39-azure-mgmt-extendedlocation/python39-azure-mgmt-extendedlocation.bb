SUMMARY = "Microsoft Azure Extendedlocation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Extendedlocation Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-extendedlocation-1.1.0-1.4.noarch.rpm"
RPM_HASH = "a7e808ca0b35b796593daa4120bfeee11e98328de2cc6206d2858ea962aa562341342648e087bd5733da0359c72133e94749b595f458d52abe4449bf69d4194b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-extendedlocation) \
python39-azure-mgmt-extendedlocation \
python3dist(azure-mgmt-extendedlocation)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-qumulo-1.0.0-1.2.noarch.rpm"
RPM_HASH = "3b4ee849753850f3f5a09e9ded801575c0a2fabc817a392442438fa064c75a3835f06cf1d65a95e178ac00d704a45f09ab371574eccfadca3e63879d06bb2828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-qumulo \
python39-azure-mgmt-qumulo \
python3dist-azure-mgmt-qumulo"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm

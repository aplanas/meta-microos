SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "30.0.0"

RPM_NAME = "python310-azure-mgmt-compute-30.0.0-1.2.noarch.rpm"
RPM_HASH = "b58063b429d1f3cc13f412ad977c29ed1e2da4e6ebed1ff814cd5231f4ecaef2b8d6660a8fa0a2ffc8af71356532de33f7a77bb65404cdca491bc10cbd264357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-compute \
python310-azure-mgmt-compute \
python3dist-azure-mgmt-compute"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm

SUMMARY = "Microsoft Azure Service Fabric Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0.0"

RPM_NAME = "python39-azure-servicefabric-8.2.0.0-1.8.noarch.rpm"
RPM_HASH = "f5a8864ae47459f0f856fe9d408ab2d14e4706701e2d382029d9455c73f3a7fb02ca28f56e4d8355a44501bf122611609b4bbc5bf1f5a3380f4a2e23da207cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-servicefabric) \
python39-azure-servicefabric \
python3dist(azure-servicefabric)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm

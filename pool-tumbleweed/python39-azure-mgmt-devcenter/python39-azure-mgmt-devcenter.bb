SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-devcenter-1.0.0.0-1.2.noarch.rpm"
RPM_HASH = "fed09d2e051bab9d3746f6f15c2d4f077ea2e87f11b1fca76a5f249ca9e4bff85ebe2083b981ae67f04df33d010f2f38b0679d384f4d28af643fc179fedb264c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-devcenter \
python39-azure-mgmt-devcenter \
python3dist-azure-mgmt-devcenter"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm

SUMMARY = "Microsoft Azure Apicenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Apicenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-apicenter-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "a0c12e50defe4b371cbf850527986402f2923ba8c18a650d3818b8e79b26a8d3722a56ac9df911ccc5ffbdaffcbddf222c16d721b6cd44f488ab629459bc8ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-apicenter \
python39-azure-mgmt-apicenter \
python3dist-azure-mgmt-apicenter"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm

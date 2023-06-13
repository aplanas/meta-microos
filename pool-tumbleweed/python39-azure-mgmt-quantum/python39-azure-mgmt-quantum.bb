SUMMARY = "Microsoft Azure Quantum Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quantum Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python39-azure-mgmt-quantum-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "e5ecd9cb2a6f323469944948a1ef1942e0b0d90cc96524f5695f5d618da276f220c9b1711d945d138d329ec4c28d6e1bb8bb0c7d3436faaf0dcffb201c8c0a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-quantum) \
python39-azure-mgmt-quantum \
python3dist(azure-mgmt-quantum)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

SUMMARY = "Microsoft Azure AgriFood Namespace Package"
DESCRIPTION = "This is the Microsoft Azure AgriFood namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.agrifood namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-agrifood-nspkg-1.0.0-1.9.noarch.rpm"
RPM_HASH = "9538468db9afc072a6ef75b9eca68070fa5b21f70b8cc2fb6dbd03bedaf8f785d9caa9ee96351a82490d9937e88532d6cb7f175292e490c3482fa386e8a79c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-agrifood-nspkg \
python310-azure-agrifood-nspkg \
python3dist-azure-agrifood-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm

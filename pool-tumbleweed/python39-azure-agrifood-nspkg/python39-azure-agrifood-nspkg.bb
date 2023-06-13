SUMMARY = "Microsoft Azure AgriFood Namespace Package"
DESCRIPTION = "This is the Microsoft Azure AgriFood namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.agrifood namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-agrifood-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "c6796cbfe207b498e0fcc550ebc553c1122aae3ca4d91438e05628925ebe72880a24b93652f06682a94e920c4b03b1521f407b364437c85fa17f290c091d08e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-agrifood-nspkg) \
python39-azure-agrifood-nspkg \
python3dist(azure-agrifood-nspkg)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-nspkg"

inherit rpm

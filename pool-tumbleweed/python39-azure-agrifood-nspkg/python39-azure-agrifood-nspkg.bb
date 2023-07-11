SUMMARY = "Microsoft Azure AgriFood Namespace Package"
DESCRIPTION = "This is the Microsoft Azure AgriFood namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.agrifood namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-agrifood-nspkg-1.0.0-1.9.noarch.rpm"
RPM_HASH = "d422439cb94f381cbbc363dc0f28b0ac5352f4252949a2e0c9b104b2aa0690c132d571818673e908738d640e48c0911fb92c4688e9f756cecc3cbe48c3f12aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-agrifood-nspkg \
python39-azure-agrifood-nspkg \
python3dist-azure-agrifood-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm

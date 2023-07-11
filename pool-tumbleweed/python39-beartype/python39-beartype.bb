SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python39-beartype-0.14.1-1.3.noarch.rpm"
RPM_HASH = "7be40e11720019eb90c5a77e6697a4e6fc6ac5353c4a5b94da31afed1478f30bb416656eea00ffbb8e416e14195976466fe271d0277630aec8c670309c559e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-beartype \
python39-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Microsoft Azure common code"
DESCRIPTION = "This is the Microsoft Azure common code. \
 \
This package provides shared code by the Azure packages."
LICENSE = "MIT"

PV = "1.1.28"

RPM_NAME = "python310-azure-common-1.1.28-1.6.noarch.rpm"
RPM_HASH = "5cb47c83bd5180dffc9eb0f82e05de64ced0ff5cd81928b6de0d19367b789d60a181ca470018629fd4d38226c4c55bb487c170b2f8d7f931243247ea89daf291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-common \
python3.10dist(azure-common) \
python310-azure-common \
python3dist(azure-common)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-nspkg"

inherit rpm

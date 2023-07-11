SUMMARY = "Microsoft Azure Security Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Security namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.security namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-security-nspkg-1.0.0-1.11.noarch.rpm"
RPM_HASH = "8fe4f13dee131aa99545ee9a9f7d5e141394cdbeaac469e32a8118547369b5c21030b0979b59d45e38c8771286f37582357184753af5e699883186ce6b1e0838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-security-nspkg \
python3.11dist-azure-security-nspkg \
python311-azure-security-nspkg \
python3dist-azure-security-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm

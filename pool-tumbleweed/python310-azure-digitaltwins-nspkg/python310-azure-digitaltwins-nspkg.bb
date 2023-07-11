SUMMARY = "Microsoft Azure Digitaltwins Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.digitaltwins namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-digitaltwins-nspkg-1.0.0-1.11.noarch.rpm"
RPM_HASH = "e455aa7dd171005a4b890fda3a491c80f145203d627be8170b6bf2e85586369208cec9f9a9b86dd65d6f8de50a88595769b6e8d04736425803d9bf336c25bb8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-digitaltwins-nspkg \
python310-azure-digitaltwins-nspkg \
python3dist-azure-digitaltwins-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm

SUMMARY = "Microsoft Azure Mixed Reality Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mixedreality namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mixedreality-nspkg-1.0.0-1.9.noarch.rpm"
RPM_HASH = "5857a55b4fa8104b42c27a2fc48bbcb110b505266e88f245cac70dbcd2fa9c7629ef83637b22373d806b25f52575b6ca8728ab233fc88e6cdb816c422c2c0983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mixedreality-nspkg \
python3.11dist-azure-mixedreality-nspkg \
python311-azure-mixedreality-nspkg \
python3dist-azure-mixedreality-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm

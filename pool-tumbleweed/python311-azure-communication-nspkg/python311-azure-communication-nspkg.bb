SUMMARY = "Microsoft Azure Communication Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Communication namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.communication namespace."
LICENSE = "MIT"

PV = "0.0.0b1"

RPM_NAME = "python311-azure-communication-nspkg-0.0.0b1-2.12.noarch.rpm"
RPM_HASH = "df6b12bf61b9151e72849e4bb51484b2b92a00e4e3424e3c3fc401ce831003b793cb5154073505c9083a8e27449b65043ef851cbee25a037a33876c34d80c4c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-nspkg \
python3.11dist-azure-communication-nspkg \
python311-azure-communication-nspkg \
python3dist-azure-communication-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm

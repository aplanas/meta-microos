SUMMARY = "Microsoft Azure Security Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Security namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.security namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-security-nspkg-1.0.0-1.10.noarch.rpm"
RPM_HASH = "69941a50cc4b7dda3b1f5ddbe2c10ff36766fa84824973db2c4765118cf5b769903a1ebccb656ec92af3ed983baf040a49be211d708c9ecf716271f0532dfcd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-security-nspkg \
python311-azure-security-nspkg \
python3dist-azure-security-nspkg"

RDEPENDS:${PN} += "python-abi \
python311-azure-nspkg"

inherit rpm

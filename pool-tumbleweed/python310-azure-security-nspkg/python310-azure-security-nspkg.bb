SUMMARY = "Microsoft Azure Security Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Security namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.security namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-security-nspkg-1.0.0-1.11.noarch.rpm"
RPM_HASH = "e7842a00c6f91e3a8334e2f5fa2cb99df6e7542a8a3f0bc9dd6a2ea571125dcfeb781008a2cf4d2164559d68d5f8eab204b2dd41a88ad6520ebcae054d2415ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-security-nspkg \
python310-azure-security-nspkg \
python3dist-azure-security-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm

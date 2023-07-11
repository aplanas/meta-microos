SUMMARY = "Microsoft Azure Security Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Security namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.security namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-security-nspkg-1.0.0-1.11.noarch.rpm"
RPM_HASH = "769f8ed2c597e72e9896b0111f892195e969a037037acd1cded8a8329822ad7fccfe613a64204de7b383ee36377b83db4cbcfea0f02b9d6fb667995b8b5e286a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-security-nspkg \
python39-azure-security-nspkg \
python3dist-azure-security-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm

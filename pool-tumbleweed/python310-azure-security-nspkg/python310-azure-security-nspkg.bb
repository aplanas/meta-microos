SUMMARY = "Microsoft Azure Security Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Security namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.security namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-security-nspkg-1.0.0-1.10.noarch.rpm"
RPM_HASH = "93fed4dba2cbd77e2c3dc984f961054d65a70fc656a0deaa21358984483b73a6fd96bc60a107ce9b6e18fba8ac31edb6fba56530759831d893c86e18bdaa21c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-security-nspkg \
python3.10dist(azure-security-nspkg) \
python310-azure-security-nspkg \
python3dist(azure-security-nspkg)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-nspkg"

inherit rpm

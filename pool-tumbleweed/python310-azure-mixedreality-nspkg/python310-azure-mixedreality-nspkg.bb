SUMMARY = "Microsoft Azure Mixed Reality Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mixedreality namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mixedreality-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "4f84861c4532676fc750626bb2fad05bfd8683ddbabd612acd23a5f14c509ba456fed7357491917ea135b9f9a217f5cbb5f90c88298dd358a01bc3451d473b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mixedreality-nspkg \
python3.10dist(azure-mixedreality-nspkg) \
python310-azure-mixedreality-nspkg \
python3dist(azure-mixedreality-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-nspkg"

inherit rpm

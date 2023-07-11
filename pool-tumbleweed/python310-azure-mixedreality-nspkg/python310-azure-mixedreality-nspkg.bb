SUMMARY = "Microsoft Azure Mixed Reality Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mixedreality namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mixedreality-nspkg-1.0.0-1.9.noarch.rpm"
RPM_HASH = "e601b4e67fcc2f5b30d24c8892d3d760a22f01759a987bd775dbe019ecd948f642fac4d6380f1fd9dc75a1d6c5266c1602d9f5b059a09e7b7e2fe5b6c47d7173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mixedreality-nspkg \
python310-azure-mixedreality-nspkg \
python3dist-azure-mixedreality-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm

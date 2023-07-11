SUMMARY = "Microsoft Azure Mixed Reality Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mixedreality namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mixedreality-nspkg-1.0.0-1.9.noarch.rpm"
RPM_HASH = "54d0d207199fe285067879172326963e524e944027c45a45e59c2b546e81e0a4c67392d617df3aa8f4a624ea0913f23e27a4a0a51c018e33264e027e1fccfece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mixedreality-nspkg \
python39-azure-mixedreality-nspkg \
python3dist-azure-mixedreality-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm

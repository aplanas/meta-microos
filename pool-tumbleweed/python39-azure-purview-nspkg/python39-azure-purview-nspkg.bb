SUMMARY = "Microsoft Azure Purview Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Purview namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.purview namespace."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-purview-nspkg-2.0.0-1.9.noarch.rpm"
RPM_HASH = "37eb71a83367062371bb47ff6349239abdf1197303a00ed32e4e25705b33829acb8288744a7dd9b91be9bcd102106632e5cd375abe693c6c6f8de5125bd3e28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-purview-nspkg \
python39-azure-purview-nspkg \
python3dist-azure-purview-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm

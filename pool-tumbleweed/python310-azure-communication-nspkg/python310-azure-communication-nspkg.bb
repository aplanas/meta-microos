SUMMARY = "Microsoft Azure Communication Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Communication namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.communication namespace."
LICENSE = "MIT"

PV = "0.0.0b1"

RPM_NAME = "python310-azure-communication-nspkg-0.0.0b1-2.11.noarch.rpm"
RPM_HASH = "a8bc19a5d01b204cc63753a8e3c94c6d283d3a634df567b7eda0085df001a9ba615a52fc6b59a90b7071495beb31e978949a33b689d1d3ca7aaaa7623d7b0425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-nspkg \
python3.10dist-azure-communication-nspkg \
python310-azure-communication-nspkg \
python3dist-azure-communication-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm

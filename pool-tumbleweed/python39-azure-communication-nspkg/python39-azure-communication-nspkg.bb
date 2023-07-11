SUMMARY = "Microsoft Azure Communication Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Communication namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.communication namespace."
LICENSE = "MIT"

PV = "0.0.0b1"

RPM_NAME = "python39-azure-communication-nspkg-0.0.0b1-2.12.noarch.rpm"
RPM_HASH = "76c34587ebcf45844e7f459219bbbf2de29d05e2fcb30287f7bd2cb1429c1bbaa1bbf6e0fb0643b2ddf879d58ba3f2b06caf01a994858e16e9d5470e06796440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-nspkg \
python39-azure-communication-nspkg \
python3dist-azure-communication-nspkg"

RDEPENDS:${PN} += "python-abi \
python39-azure-nspkg"

inherit rpm

SUMMARY = "Microsoft Azure Communication Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Communication namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.communication namespace."
LICENSE = "MIT"

PV = "0.0.0b1"

RPM_NAME = "python310-azure-communication-nspkg-0.0.0b1-2.12.noarch.rpm"
RPM_HASH = "070d138883380516bf43587bfaced1e06e4702580e547d09cdc1a5dcdd7e1e6e44bcebb2d2c6d92bd8dc3540a355d3fa2a1d79d3bfea820536a7974cf0588208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-nspkg \
python310-azure-communication-nspkg \
python3dist-azure-communication-nspkg"

RDEPENDS:${PN} += "python-abi \
python310-azure-nspkg"

inherit rpm

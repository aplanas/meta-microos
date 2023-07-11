SUMMARY = "Microsoft Azure Communication Identity Service Client Library for Python"
DESCRIPTION = "Azure Communication Identity client package is intended to be used to setup the basics for opening a \
way to use Azure Communication Service offerings. This package helps to create identity user tokens \
to be used by other client packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python39-azure-communication-identity-1.3.1-1.5.noarch.rpm"
RPM_HASH = "47d4df7329be7af85228e325d7849966d97823295f0c9d3eba3ff8734def0e4dcd831a1ad84f830c795081e59f80853412f6ae34388b7f6fcc757df877c2de60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-identity \
python39-azure-communication-identity \
python3dist-azure-communication-identity"

RDEPENDS:${PN} += "python-abi \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest \
python39-six"

inherit rpm

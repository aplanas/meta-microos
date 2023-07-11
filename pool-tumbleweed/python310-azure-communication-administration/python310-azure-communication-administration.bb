SUMMARY = "Microsoft Azure Communication Administration Service Client Library for Python"
DESCRIPTION = "Azure Communication Administration client package is intended to be used to setup the basics for opening a way to use \
Azure Communication Service offerings. This package helps to create identities user tokens to be used by other client \
packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-communication-administration-1.0.0b4-1.10.noarch.rpm"
RPM_HASH = "453e9e7753d6925ab360c3ad2b622b8c78c38bdb3b8655cf66e9b56502257e34c0f73679ecc53aadd842914e2c8c79c7eba450c8eac5819fb571b943433d1171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-communication-administration \
python310-azure-communication-administration \
python3dist-azure-communication-administration"

RDEPENDS:${PN} += "python-abi \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest"

inherit rpm

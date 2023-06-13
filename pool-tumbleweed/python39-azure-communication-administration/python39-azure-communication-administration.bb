SUMMARY = "Microsoft Azure Communication Administration Service Client Library for Python"
DESCRIPTION = "Azure Communication Administration client package is intended to be used to setup the basics for opening a way to use \
Azure Communication Service offerings. This package helps to create identities user tokens to be used by other client \
packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-communication-administration-1.0.0b4-1.8.noarch.rpm"
RPM_HASH = "7142fe800adb8b81606baa13964c62f0733039d29e2400b35551bda08a5348a61e19ec4794cebab637f9cb6fee8c9701e95c9afabd1290d108b4fb1e9fdcaa6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-communication-administration) \
python39-azure-communication-administration \
python3dist(azure-communication-administration)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest"

inherit rpm

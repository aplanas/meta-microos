SUMMARY = "Microsoft Azure Communication Administration Service Client Library for Python"
DESCRIPTION = "Azure Communication Administration client package is intended to be used to setup the basics for opening a way to use \
Azure Communication Service offerings. This package helps to create identities user tokens to be used by other client \
packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python39-azure-communication-administration-1.0.0b4-1.10.noarch.rpm"
RPM_HASH = "e1c0df9275b83192f6118cc593e54962285f2869b9f3e69084ffec4b3e998c107deb002384883cc6a8d89708e664ab81aaf1107d74e886a3c660299c377b3a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-communication-administration \
python39-azure-communication-administration \
python3dist-azure-communication-administration"

RDEPENDS:${PN} += "python-abi \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest"

inherit rpm

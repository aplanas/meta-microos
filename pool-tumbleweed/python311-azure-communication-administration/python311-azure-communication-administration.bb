SUMMARY = "Microsoft Azure Communication Administration Service Client Library for Python"
DESCRIPTION = "Azure Communication Administration client package is intended to be used to setup the basics for opening a way to use \
Azure Communication Service offerings. This package helps to create identities user tokens to be used by other client \
packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-communication-administration-1.0.0b4-1.10.noarch.rpm"
RPM_HASH = "3efab8681106a32c216beaa2a2b1d70283e43e6e8629a2251763479dae7ac5dcc07d15acc714b9c30327790bd9ea5890c4503bf54d16ed29208ad6d5901043d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-administration \
python3.11dist-azure-communication-administration \
python311-azure-communication-administration \
python3dist-azure-communication-administration"

RDEPENDS:${PN} += "python-abi \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest"

inherit rpm

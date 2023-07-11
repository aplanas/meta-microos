SUMMARY = "Microsoft Azure Communication Identity Service Client Library for Python"
DESCRIPTION = "Azure Communication Identity client package is intended to be used to setup the basics for opening a \
way to use Azure Communication Service offerings. This package helps to create identity user tokens \
to be used by other client packages such as chat, calling, sms."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python311-azure-communication-identity-1.3.1-1.5.noarch.rpm"
RPM_HASH = "0352abc83ebe570657d64a55fc51d65701cf4cd2ea4408dbfdef66a96497f32dc55d49a46308cb381b3f53029e5bf4135e3f38d8de7d3ca9fb702aeeb2396d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-identity \
python3.11dist-azure-communication-identity \
python311-azure-communication-identity \
python3dist-azure-communication-identity"

RDEPENDS:${PN} += "python-abi \
python311-azure-communication-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm

SUMMARY = "Extends clickGroup to invoke a command without explicit subcommand name"
DESCRIPTION = "Extends click.Group to invoke a command without explicit subcommand name."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "python311-click-default-group-1.2.2-2.10.noarch.rpm"
RPM_HASH = "f5f33e959dfe54438a15eca9e5d996bfcaa6def54ac3e1ac6de0b246e01b9c297974b4093f61c7bafff15374123b4aeb142f55f57e390c22b24a4e1a9cdffeba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-default-group \
python3.11dist-click-default-group \
python311-click-default-group \
python3dist-click-default-group"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm

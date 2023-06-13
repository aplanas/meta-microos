SUMMARY = "Microsoft Azure CLI 2.0"
DESCRIPTION = "Microsoft Azure CLI 2.0 Command Line Utilities"
LICENSE = "MIT"

PV = "2.49.0"

RPM_NAME = "azure-cli-test-2.49.0-1.1.aarch64.rpm"
RPM_HASH = "5004907ca7fc3380916784816bb8f648461659293f1a678eede54d980e131b9969f7f943360a00c5b5cd64fa542c749aa21556b4589b9bb288bf8fb40fdd458f"

RPROVIDES:${PN} += "azure-cli-test \
azure-cli-test(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

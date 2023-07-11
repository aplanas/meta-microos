SUMMARY = "Additional argparse types and actions"
DESCRIPTION = "Additional argparse types and actions."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python311-argparse_addons-0.12.0-1.3.noarch.rpm"
RPM_HASH = "15505d72356e0e6da323ea316bc67961a5fa09cb2f1e0e85ec5f8f94eb5fb8b316fec72411be886ab348ad0254a677e8fd7f131ae6db1286a9e0bf8e639d1c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argparse-addons \
python3.11dist-argparse-addons \
python311-argparse-addons \
python3dist-argparse-addons"

RDEPENDS:${PN} += "python-abi"

inherit rpm

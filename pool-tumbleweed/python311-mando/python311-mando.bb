SUMMARY = "Python wrapper around argparse, a tool to create CLI apps"
DESCRIPTION = "Mando is a wrapper around argparse, and allows writing CLI \
applications."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-mando-0.7.1-2.3.noarch.rpm"
RPM_HASH = "a82e8cb8267d13726f0ff688b1fc2b06b9d0f6b94511bfba206522b91592f3659c4a7f48f27692c9b912fe85378cadbb896407fe3ef2e8f2cc92a9657f9094e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mando \
python3.11dist-mando \
python311-mando \
python3dist-mando"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm

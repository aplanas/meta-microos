SUMMARY = "A lightweight console printing and formatting toolkit"
DESCRIPTION = "A lightweight console printing and formatting toolkit."
LICENSE = "LGPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "python310-wasabi-1.1.1-1.1.noarch.rpm"
RPM_HASH = "5f5b58a737a43ae218d23e038e489553b8a6dc4d25704fc668313fe6d4af578107f2080f85239c175b7dfa388a5ba33ca480c0736efe3126cd0b2e257689357b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wasabi \
python310-wasabi \
python3dist-wasabi"

RDEPENDS:${PN} += "python-abi"

inherit rpm

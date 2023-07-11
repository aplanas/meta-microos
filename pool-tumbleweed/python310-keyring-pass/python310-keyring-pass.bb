SUMMARY = "Pass backend for python-keyring"
DESCRIPTION = "python-keyring backend getting data from pass."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-keyring-pass-0.7.1-1.5.noarch.rpm"
RPM_HASH = "a8987794d7dd70c824957f4c5bf43e6ccd1aa05080225ffd4c92717f933b15bcf8164f098a67df33e04b3070fc537a19aa96df99209486558fe9f4549f84af53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-keyring-pass \
python310-keyring-pass \
python3dist-keyring-pass"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.classes \
python310-keyring"

inherit rpm

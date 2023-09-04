SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-pipx-1.2.0-2.1.noarch.rpm"
RPM_HASH = "ab894a227bd5ccbd3007a2ba3acb9a361347a92c166c0d5de17f4f5aad1a8d7187ecc4e1accb893b686d55263608b90ea5f4a6e28e06893c8a38fe59ec289454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipx \
python3.11dist-pipx \
python311-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-argcomplete \
python311-packaging \
python311-userpath"

inherit rpm

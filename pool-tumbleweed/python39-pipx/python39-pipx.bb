SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-pipx-1.2.0-1.3.noarch.rpm"
RPM_HASH = "91fe120f3789bac7e4877bc2a76ca35881efcc5de7def8dda1191c834582caddee1ea052aecc153a43a7843f5900f6d95480c83a502a02238b94655261c1bf2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pipx \
python39-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-argcomplete \
python39-packaging \
python39-userpath"

inherit rpm

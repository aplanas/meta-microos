SUMMARY = "Install and run Python applications in isolated environments"
DESCRIPTION = "Install and run Python applications in isolated environments."
LICENSE = "MIT"

PV = "0.14.0.0"

RPM_NAME = "python311-pipx-0.14.0.0-2.14.noarch.rpm"
RPM_HASH = "79ee4d8b61ddfb0eb6176e757fac864486bcebdd4cea2e5cb6813589d89dd1ae3b6f82c70050d0c5485cfa76d7b6a635a2ce050c9e322ad8d8939fd6ef16f8ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pipx) \
python311-pipx \
python3dist(pipx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-argcomplete \
python311-setuptools \
python311-userpath \
update-alternatives"

inherit rpm

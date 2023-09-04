SUMMARY = "Flexible evolution of Mercurial history"
DESCRIPTION = "Flexible evolution of Mercurial history."
LICENSE = "GPL-2.0-or-later"

PV = "11.0.2"

RPM_NAME = "mercurial-extension-hg-evolve-11.0.2-1.1.noarch.rpm"
RPM_HASH = "93e8699a7d6f86d200445adacac1e33b14ae0a93345753517e8159ab99ef780f7d4290da517ab0ca5210791b6820d21e6a100fb12f9114cb06aed32f6ef39359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mercurial-extension-hg-evolve \
python3.11dist-hg-evolve \
python3dist-hg-evolve"

RDEPENDS:${PN} += "mercurial \
python-abi"

inherit rpm

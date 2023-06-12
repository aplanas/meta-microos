SUMMARY = "Flexible evolution of Mercurial history"
DESCRIPTION = "Flexible evolution of Mercurial history."
LICENSE = "GPL-2.0-or-later"

PV = "11.0.1"

RPM_NAME = "mercurial-extension-hg-evolve-11.0.1-1.1.noarch.rpm"
RPM_HASH = "9c2bcaa2ce55e3a492874c5771ed47a12e7646e71a469cfd18d76126d6847934b81db933a220f82e84690ae3d127a8e7296540fd6c5d3317ff099f8bbe50a390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mercurial-extension-hg-evolve \
python3.10dist(hg-evolve) \
python3dist(hg-evolve)"
RDEPENDS:${PN} += "mercurial \
python(abi)"

inherit rpm

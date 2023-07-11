SUMMARY = "Flexible evolution of Mercurial history"
DESCRIPTION = "Flexible evolution of Mercurial history."
LICENSE = "GPL-2.0-or-later"

PV = "11.0.1"

RPM_NAME = "mercurial-extension-hg-evolve-11.0.1-1.2.noarch.rpm"
RPM_HASH = "06281a24749581867258192904126b31c58179e38ec8df2662a00ac747fc3e5a712bffaca33706b5afb0a7ec0934e1f37b96339c0d6dd01a3b7f014325c6c1c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mercurial-extension-hg-evolve \
python3.11dist-hg-evolve \
python3dist-hg-evolve"

RDEPENDS:${PN} += "mercurial \
python-abi"

inherit rpm

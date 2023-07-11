SUMMARY = "Attract all documentations of installed TeXLive packages"
DESCRIPTION = "This package will attract all the documentation packages of any \
already installed TeXLive package."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.208"

RPM_NAME = "texlive-alldocumentation-2023.208-60.1.noarch.rpm"
RPM_HASH = "aff2137c7a0f76a47a5e0a8cfa0f2bd4b6b4c9fa73d9538693369e8954d6f3f0da1edff171f147a77ff7ebe82d344d20af5f08f6aa1bd3e4fc3716e2ed61a7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alldocumentation"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-jura"
DESCRIPTION = "This package includes the documentation for texlive-jura"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.3svn15878"

RPM_NAME = "texlive-jura-doc-2023.209.4.3svn15878-56.1.noarch.rpm"
RPM_HASH = "2ce97ac72b8cbf6b55ad113c66d77337247899a17d158dd932b54a509dfb96067d30d5acfb75ee4d1409c6dbaefcd7d88af1bbda7535a44187cac8d6642ca713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jura-doc-en;de \
texlive-jura-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm

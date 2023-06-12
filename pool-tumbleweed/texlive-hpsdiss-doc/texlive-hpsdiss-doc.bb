SUMMARY = "Documentation for texlive-hpsdiss"
DESCRIPTION = "This package includes the documentation for texlive-hpsdiss"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "975bf88a9f7b3ca5887fd9a7607533b9b05fef17291172c416303ea4ad90c32cefed31ec13f9b74c15df427e7a2c6d076cd35daeac482c7bdef449269c58a639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hpsdiss-doc"
RDEPENDS:${PN} += ""

inherit rpm

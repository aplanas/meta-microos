SUMMARY = "Documentation for texlive-wasy"
DESCRIPTION = "This package includes the documentation for texlive-wasy"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.5svn53533"

RPM_NAME = "texlive-wasy-doc-2023.209.2.5svn53533-54.1.noarch.rpm"
RPM_HASH = "b198dc044fb92ee63d1deeda8b6f8d4cf7c509ad0dcaa661e063972a38195a4018615fafd5b39da55c005358f32eb6ac79fab40160c399a984fd48557c7ce318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wasy-doc"

RDEPENDS:${PN} += ""

inherit rpm

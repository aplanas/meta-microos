SUMMARY = "Documentation for texlive-hexgame"
DESCRIPTION = "This package includes the documentation for texlive-hexgame"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hexgame-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "9c7cfc2a10c43dbb3bbcfaa302614201bbafa268d11124a1efd3e6e4d4b3817c8fcd46d0d2f74567fca6ed485a7a189d36f090a81d63f066dab44ce1e243a78d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexgame-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-bxpdfver"
DESCRIPTION = "This package includes the documentation for texlive-bxpdfver"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn63185"

RPM_NAME = "texlive-bxpdfver-doc-2023.201.0.0.6svn63185-52.1.noarch.rpm"
RPM_HASH = "e4e60b63407ffbb63c82f79a160f6bb202f0c93050022c61c25494cf35871dab5642d29b3e9a26afe0c7c7b5f332215b83b4abf1b6eec22168225897777e8794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bxpdfver-doc:ja) \
texlive-bxpdfver-doc"

RDEPENDS:${PN} += ""

inherit rpm

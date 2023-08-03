SUMMARY = "Documentation for texlive-alphalph"
DESCRIPTION = "This package includes the documentation for texlive-alphalph"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn53087"

RPM_NAME = "texlive-alphalph-doc-2023.209.2.6svn53087-55.1.noarch.rpm"
RPM_HASH = "149e38bf22773553aac8eb226c30438886aae014076282ff9e006760caccc25f8513d826faa00676499b695aec5270c01513c48cf265ef670a938a6bedcf59eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alphalph-doc"

RDEPENDS:${PN} += ""

inherit rpm

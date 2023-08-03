SUMMARY = "Documentation for texlive-textpos"
DESCRIPTION = "This package includes the documentation for texlive-textpos"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10.1svn63967"

RPM_NAME = "texlive-textpos-doc-2023.209.1.10.1svn63967-55.1.noarch.rpm"
RPM_HASH = "07102175443bf2357a79d91ccfd1363cf6ddfc11078671843d6713f51a14354c06c7914a7124dc4a9463763d373cfe71985b325094920efc28b146a9bdee1277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textpos-doc"

RDEPENDS:${PN} += ""

inherit rpm

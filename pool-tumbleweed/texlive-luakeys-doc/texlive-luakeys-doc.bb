SUMMARY = "Documentation for texlive-luakeys"
DESCRIPTION = "This package includes the documentation for texlive-luakeys"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.13.0svn65533"

RPM_NAME = "texlive-luakeys-doc-2023.208.0.0.13.0svn65533-53.1.noarch.rpm"
RPM_HASH = "a4848466ca088d1de5095437c8679187ec346d7368f500b275c4311595412cb24f43bf7910d1079ba965ee258cbcb1eb8d641af607fdfc1cbf375d87b32d9e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luakeys-doc"

RDEPENDS:${PN} += ""

inherit rpm

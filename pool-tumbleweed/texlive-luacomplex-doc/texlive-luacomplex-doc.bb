SUMMARY = "Documentation for texlive-luacomplex"
DESCRIPTION = "This package includes the documentation for texlive-luacomplex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65833"

RPM_NAME = "texlive-luacomplex-doc-2023.201.1.2svn65833-52.1.noarch.rpm"
RPM_HASH = "7c1aee29258a1330b3c295d0d757fda4193b609f6df47dd0f015d580022926e39fe7680bf9bf96bba7e21aad2b4a32c8e69b1de33b18a98d875742301fa1d389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacomplex-doc"

RDEPENDS:${PN} += ""

inherit rpm

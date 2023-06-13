SUMMARY = "Documentation for texlive-ptext"
DESCRIPTION = "This package includes the documentation for texlive-ptext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn30171"

RPM_NAME = "texlive-ptext-doc-2023.201.1.1svn30171-53.1.noarch.rpm"
RPM_HASH = "294a3ec8383f4c9d53e36d6ed4d12974fb9bdd40beda2fc22d036c140cf74e62b3f405593eb6a91476bdc13b5350ff353ed053e6317d61362be34e0448f35576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ptext-doc:fa) \
texlive-ptext-doc"

RDEPENDS:${PN} += ""

inherit rpm

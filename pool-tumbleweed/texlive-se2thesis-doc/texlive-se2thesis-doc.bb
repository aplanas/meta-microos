SUMMARY = "Documentation for texlive-se2thesis"
DESCRIPTION = "This package includes the documentation for texlive-se2thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn65645"

RPM_NAME = "texlive-se2thesis-doc-2023.209.2.1.0svn65645-54.1.noarch.rpm"
RPM_HASH = "99224d8bdbc5f642bbe1a2ac5fb2a8989bfee42066ea8ca1001e8489b34238423b21745c0f948a115f963c9c48bd35f40e8d24fd479d5c93b7d963062bacd8e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-se2thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm

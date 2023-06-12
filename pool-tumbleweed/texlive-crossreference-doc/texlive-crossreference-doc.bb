SUMMARY = "Documentation for texlive-crossreference"
DESCRIPTION = "This package includes the documentation for texlive-crossreference"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-crossreference-doc-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "bea719f1c0fe13226c6f916d06e219ac3f3547fe64cac368fda1e531d4486c2c76602a789f991286ffd91bd3b6019ae4a191a85a37f924f4453aa7f2145905d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossreference-doc"
RDEPENDS:${PN} += ""

inherit rpm

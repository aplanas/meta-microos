SUMMARY = "Documentation for texlive-utfsym"
DESCRIPTION = "This package includes the documentation for texlive-utfsym"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.0svn63076"

RPM_NAME = "texlive-utfsym-doc-2023.209.0.0.9.0svn63076-54.1.noarch.rpm"
RPM_HASH = "2723da889624b744f090725f10b7dc9ecb712ea7ae5b59302f68317cdb33769e9d78d3c7304917660f4d1d7f43333f2e316c398205eb32353f1a95f64d92900a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-utfsym-doc-de \
texlive-utfsym-doc"

RDEPENDS:${PN} += ""

inherit rpm

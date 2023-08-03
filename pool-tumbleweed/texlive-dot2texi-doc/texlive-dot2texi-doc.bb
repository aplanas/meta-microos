SUMMARY = "Documentation for texlive-dot2texi"
DESCRIPTION = "This package includes the documentation for texlive-dot2texi"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.0svn26237"

RPM_NAME = "texlive-dot2texi-doc-2023.209.3.0svn26237-53.1.noarch.rpm"
RPM_HASH = "d2dd4fda6bca7c676d961d9fafd71f4047afbd4a81161d54d289c2f963ed903c793e6e3172c395d1abac5860da33fa28e438256a026d19f186c77a5a7aef3f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dot2texi-doc"

RDEPENDS:${PN} += ""

inherit rpm

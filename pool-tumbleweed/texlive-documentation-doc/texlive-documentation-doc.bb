SUMMARY = "Documentation for texlive-documentation"
DESCRIPTION = "This package includes the documentation for texlive-documentation"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34521"

RPM_NAME = "texlive-documentation-doc-2023.209.0.0.1svn34521-53.1.noarch.rpm"
RPM_HASH = "0e5dd29eba141cdd757ee7b3f6443a7418cd2cdcdb9181f10188ee5ecc29462c5d616e682ce687d4f4c2e3868dacf49c08810c43bf381b66893f99ab4a42eb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-documentation-doc"

RDEPENDS:${PN} += ""

inherit rpm

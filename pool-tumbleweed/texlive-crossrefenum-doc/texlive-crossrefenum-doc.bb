SUMMARY = "Documentation for texlive-crossrefenum"
DESCRIPTION = "This package includes the documentation for texlive-crossrefenum"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.2svn66014"

RPM_NAME = "texlive-crossrefenum-doc-2023.209.1.0.2svn66014-55.1.noarch.rpm"
RPM_HASH = "853c2bd3087979137871286a73ad66dcaa8506d3815056eb411e9c3daa8f81eb5cdddd71dc129e4b79fcef2fc62c075495949eefad35c8084246e0ea91e12638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossrefenum-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-egameps"
DESCRIPTION = "This package includes the documentation for texlive-egameps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-egameps-doc-2023.209.1.1svn15878-54.2.noarch.rpm"
RPM_HASH = "3c3dcf4e1e86c09f5f4ed304e86baa8f8dce1185d9a182f7abcc3a7c79d6516b51a1458fd3a15d1d0c2f502d7a1f5a61941db702c0cc67ddd21da70fb4630fd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egameps-doc"

RDEPENDS:${PN} += ""

inherit rpm

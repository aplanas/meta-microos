SUMMARY = "Documentation for texlive-crossreference"
DESCRIPTION = "This package includes the documentation for texlive-crossreference"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-crossreference-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "79bc9f5fa7d2f77ea3d0a5ff449e85bddc8be1f5fb15be94139b5b6c85af5cbe1b942a3c1fbe06d1a8577f2b0975753ee81f3ccae80fef06817e80aa894dd251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossreference-doc"

RDEPENDS:${PN} += ""

inherit rpm

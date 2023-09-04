SUMMARY = "Documentation for texlive-gloss"
DESCRIPTION = "This package includes the documentation for texlive-gloss"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2svn15878"

RPM_NAME = "texlive-gloss-doc-2023.209.1.5.2svn15878-54.2.noarch.rpm"
RPM_HASH = "4854685130e89296c0d86cb0ec11fbb2e8722c494b255ff8e049caa785666867d0e169dfe0fdb2610915ddcfa02e969bfe999108a403b6f36c33940eb3d4b609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-mdwtools"
DESCRIPTION = "This package includes the documentation for texlive-mdwtools"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.05.4svn15878"

RPM_NAME = "texlive-mdwtools-doc-2023.208.1.05.4svn15878-53.1.noarch.rpm"
RPM_HASH = "3ebae91847c0b9c70f3e0f595631c3e640297bb5eee00be678e132ff3f0f23c90cb4f68f772ada8fea0486a937861f7287184f0a962aa4ad3c72e168d37363d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdwtools-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-tikz-dependency"
DESCRIPTION = "This package includes the documentation for texlive-tikz-dependency"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54512"

RPM_NAME = "texlive-tikz-dependency-doc-2023.209.1.2svn54512-55.1.noarch.rpm"
RPM_HASH = "db540e663730e9ef269347f4263a97adf62376d7d819c828666eacc20c4b84d05cc22cc48292d68475d3a1819365588efeef17488e11b4ca8ee2e0ae19637e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-dependency-doc"

RDEPENDS:${PN} += ""

inherit rpm

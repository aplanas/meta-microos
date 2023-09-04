SUMMARY = "Documentation for texlive-robustcommand"
DESCRIPTION = "This package includes the documentation for texlive-robustcommand"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-doc-2023.209.0.0.1svn15878-54.2.noarch.rpm"
RPM_HASH = "a761d924a9483ddd067cccc454896ae1ff13aa80228a0d849013cb043ad0517edd979f29f1d1b0ca7091a82201b7e30df2f0d7362ccd577942269b1e46f88b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-robustcommand-doc-de \
texlive-robustcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm

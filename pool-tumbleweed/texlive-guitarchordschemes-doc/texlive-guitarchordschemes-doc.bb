SUMMARY = "Documentation for texlive-guitarchordschemes"
DESCRIPTION = "This package includes the documentation for texlive-guitarchordschemes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-doc-2023.201.0.0.7svn54512-53.2.noarch.rpm"
RPM_HASH = "a871ddb95c9e58b2c520ebe7025de302cba550e607951af0caac76c8c253f3d439373f927f7da45dbde88fa7331c17c28c039dfeab1c44c93cbb0a4e01db3cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-guitarchordschemes-doc-en \
texlive-guitarchordschemes-doc"

RDEPENDS:${PN} += ""

inherit rpm

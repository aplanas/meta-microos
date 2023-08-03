SUMMARY = "Documentation for texlive-wasy-type1"
DESCRIPTION = "This package includes the documentation for texlive-wasy-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.001.002svn53534"

RPM_NAME = "texlive-wasy-type1-doc-2023.209.001.002svn53534-54.1.noarch.rpm"
RPM_HASH = "036c77b0047bc3fdcb72f67337ed7bdc1398aa54ef9971ee63a3981570ec734edeae742b840929c3b847115545a1ae9b279672779a59027efd684b2da4ef3209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wasy-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm

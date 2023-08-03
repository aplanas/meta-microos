SUMMARY = "Documentation for texlive-optex"
DESCRIPTION = "This package includes the documentation for texlive-optex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.11svn66513"

RPM_NAME = "texlive-optex-doc-2023.209.1.11svn66513-55.1.noarch.rpm"
RPM_HASH = "d10355ab6915a454f0eb3f45dc6dce6184224b13f5668f49229c447632f065c636db2395a3efc4c3e967b99a98f9ebb8ed54321b7d0031aac63b7f2b5ba70bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-optex.1 \
texlive-optex-doc"

RDEPENDS:${PN} += ""

inherit rpm

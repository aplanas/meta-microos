SUMMARY = "Documentation for texlive-delimtxt"
DESCRIPTION = "This package includes the documentation for texlive-delimtxt"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn16549"

RPM_NAME = "texlive-delimtxt-doc-2023.209.svn16549-53.1.noarch.rpm"
RPM_HASH = "a128aed72a541b8c73a4a642d828ef9337ccc7ad4f72c01b28df6cd62fab350d7793c21a401efa5a274297eecc1b885347bc55885b477d4edb05d49c2fa972cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delimtxt-doc"

RDEPENDS:${PN} += ""

inherit rpm

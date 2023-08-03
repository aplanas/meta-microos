SUMMARY = "Documentation for texlive-chktex"
DESCRIPTION = "This package includes the documentation for texlive-chktex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.7.8svn64797"

RPM_NAME = "texlive-chktex-doc-2023.209.1.7.8svn64797-54.1.noarch.rpm"
RPM_HASH = "190be014048d1ccf2bd4d9c1202ac69aedcfe61f4b65783ae5efdbf8027b988aa196d328406c655018c50e68ac93aeb038b1f9bf74c9d2f063a94298c3dadb1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-chktex.1 \
man-chkweb.1 \
man-deweb.1 \
texlive-chktex-doc"

RDEPENDS:${PN} += ""

inherit rpm

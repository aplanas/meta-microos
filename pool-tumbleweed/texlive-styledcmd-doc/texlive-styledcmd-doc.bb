SUMMARY = "Documentation for texlive-styledcmd"
DESCRIPTION = "This package includes the documentation for texlive-styledcmd"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0svn65262"

RPM_NAME = "texlive-styledcmd-doc-2023.201.2.0svn65262-57.1.noarch.rpm"
RPM_HASH = "5a45a832630685de8e623e2442bb08e01244cc5444b831ccb4a20b15e7f4e6e9ea6a1e882ed88bfdb206550a88ed3b385349b905679bcdc52ab4cab753155053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-styledcmd-doc"
RDEPENDS:${PN} += ""

inherit rpm

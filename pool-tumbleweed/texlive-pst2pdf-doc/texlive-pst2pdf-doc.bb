SUMMARY = "Documentation for texlive-pst2pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.20svn56172"

RPM_NAME = "texlive-pst2pdf-doc-2023.209.0.0.20svn56172-54.1.noarch.rpm"
RPM_HASH = "853bc5a9f91ad3d6f8e244d11e75c5c4d97ad024b481f9d126333474f26bed8e879927a66c611c3ca57b0e7f93875786517baf62f86fa2fdd21ead0b1ae36ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst2pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm

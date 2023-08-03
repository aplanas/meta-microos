SUMMARY = "Documentation for texlive-pst-graphicx"
DESCRIPTION = "This package includes the documentation for texlive-pst-graphicx"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn21717"

RPM_NAME = "texlive-pst-graphicx-doc-2023.209.0.0.02svn21717-53.1.noarch.rpm"
RPM_HASH = "db86c02b7a7fbcb9c9f63b25471eca20697940f32a5e92f5e2dccb1e084fbc707d2bece5dc9adff8ac71ab343aa30a7f448f1a7ab1b2c134ebfe6d3747a53b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-graphicx-doc"

RDEPENDS:${PN} += ""

inherit rpm

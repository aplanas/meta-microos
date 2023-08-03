SUMMARY = "Documentation for texlive-vmargin"
DESCRIPTION = "This package includes the documentation for texlive-vmargin"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5svn15878"

RPM_NAME = "texlive-vmargin-doc-2023.209.2.5svn15878-54.1.noarch.rpm"
RPM_HASH = "8d160db1267673807994aa10ce88db20bd2dc9e426238ce3053e0969848e0b8dddced53ed9cd1e8af8356a2df9cf417b0d9f77287a901b0131c1bf36c3874eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vmargin-doc"

RDEPENDS:${PN} += ""

inherit rpm

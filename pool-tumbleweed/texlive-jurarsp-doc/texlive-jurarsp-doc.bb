SUMMARY = "Documentation for texlive-jurarsp"
DESCRIPTION = "This package includes the documentation for texlive-jurarsp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.52svn15878"

RPM_NAME = "texlive-jurarsp-doc-2023.201.0.0.52svn15878-55.1.noarch.rpm"
RPM_HASH = "f1c738b9d698d635aed34e9e1aabd820b4886ef0d512b80ade1e806c09e97df6df877e08ca88f935931e63a4fa4b4e79c2a6b6e904519bc6a85f4560d79e6f69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jurarsp-doc-de \
texlive-jurarsp-doc"

RDEPENDS:${PN} += ""

inherit rpm

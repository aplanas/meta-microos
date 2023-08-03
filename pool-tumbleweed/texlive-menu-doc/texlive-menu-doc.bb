SUMMARY = "Documentation for texlive-menu"
DESCRIPTION = "This package includes the documentation for texlive-menu"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.994svn15878"

RPM_NAME = "texlive-menu-doc-2023.209.0.0.994svn15878-55.1.noarch.rpm"
RPM_HASH = "55fa46318000f24f1f9e56a6bfdd7a81afc49dc78b31d8f3bccab50b1bcc90b7a51ffc09e819f48ff78911282e402a54d7afeeba53cb7127ac09749e18ea2e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-menu-doc"

RDEPENDS:${PN} += ""

inherit rpm

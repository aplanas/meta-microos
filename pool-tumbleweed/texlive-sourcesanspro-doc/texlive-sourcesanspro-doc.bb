SUMMARY = "Documentation for texlive-sourcesanspro"
DESCRIPTION = "This package includes the documentation for texlive-sourcesanspro"
LICENSE = "OFL-1.1"

PV = "2023.201.2.8svn54892"

RPM_NAME = "texlive-sourcesanspro-doc-2023.201.2.8svn54892-57.1.noarch.rpm"
RPM_HASH = "6660ec107bd152fbe36bd01ead2d474ab6826194efdb823113a706281841c06e995697b4237ec5049824e2d43d961f5dcb7df604317899e32b4a3b123f21c541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sourcesanspro-doc"

RDEPENDS:${PN} += ""

inherit rpm

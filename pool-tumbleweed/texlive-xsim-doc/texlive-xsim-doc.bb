SUMMARY = "Documentation for texlive-xsim"
DESCRIPTION = "This package includes the documentation for texlive-xsim"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn61988"

RPM_NAME = "texlive-xsim-doc-2023.209.0.0.21svn61988-53.1.noarch.rpm"
RPM_HASH = "83894f817a0495bc1db8c40c5347bc381e30e5409627f320834d8877e06b7bc1afe05508e464e2edad49d42bc439f14431cb999ed9237d4bda4331242aa9c104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsim-doc"

RDEPENDS:${PN} += ""

inherit rpm

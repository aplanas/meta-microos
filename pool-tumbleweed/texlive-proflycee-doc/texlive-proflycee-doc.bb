SUMMARY = "Documentation for texlive-proflycee"
DESCRIPTION = "This package includes the documentation for texlive-proflycee"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5.4svn66581"

RPM_NAME = "texlive-proflycee-doc-2023.209.2.5.4svn66581-53.1.noarch.rpm"
RPM_HASH = "69692e03f7ef4a3297bce097cebdedb47555bbd4bc99eb818a85967a1426ed5adc55288ea48ac2d6fd448d66ac48b00fbe51181d84e775f462f4ae3e209ef326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-proflycee-doc-fr \
texlive-proflycee-doc"

RDEPENDS:${PN} += ""

inherit rpm

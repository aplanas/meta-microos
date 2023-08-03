SUMMARY = "Documentation for texlive-bxdpx-beamer"
DESCRIPTION = "This package includes the documentation for texlive-bxdpx-beamer"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn41813"

RPM_NAME = "texlive-bxdpx-beamer-doc-2023.209.0.0.3svn41813-53.1.noarch.rpm"
RPM_HASH = "52f85ac1bc098788d1b46649be6ed0d5cae2017d4a17758162fde026c70dee3345f0009dfccc06a76045c3a8a78011d4395f459d20315985d54b658df1f9fde4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxdpx-beamer-doc"

RDEPENDS:${PN} += ""

inherit rpm

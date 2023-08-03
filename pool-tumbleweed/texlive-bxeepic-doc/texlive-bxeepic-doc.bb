SUMMARY = "Documentation for texlive-bxeepic"
DESCRIPTION = "This package includes the documentation for texlive-bxeepic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn30559"

RPM_NAME = "texlive-bxeepic-doc-2023.209.0.0.2svn30559-53.1.noarch.rpm"
RPM_HASH = "ec597175b9173072b4edd2a8e665a057c5f6a7a40dd7e8056f41aa7b422882a0e0114cb5ba417722e78232546e4d694d47f7acb846c1781521522808753e89a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxeepic-doc"

RDEPENDS:${PN} += ""

inherit rpm

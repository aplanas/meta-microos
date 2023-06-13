SUMMARY = "Documentation for texlive-mathtools"
DESCRIPTION = "This package includes the documentation for texlive-mathtools"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.29svn63767"

RPM_NAME = "texlive-mathtools-doc-2023.201.1.29svn63767-52.1.noarch.rpm"
RPM_HASH = "6fa0739fb0da13fd994c6267068376445a1cad54105332421ae7a26982254440c4dd1dc4480b526f4fa2566aea3ad2b7f5365dd68f95a638141c9282027331e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathtools-doc"

RDEPENDS:${PN} += ""

inherit rpm

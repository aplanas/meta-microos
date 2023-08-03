SUMMARY = "Documentation for texlive-vruler"
DESCRIPTION = "This package includes the documentation for texlive-vruler"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn21598"

RPM_NAME = "texlive-vruler-doc-2023.209.2.3svn21598-54.1.noarch.rpm"
RPM_HASH = "910df58054f7ab2a4d10a78efcb3334f86528ebce61b5c54d12bf1086445bb0db1c2b3dc5763b2ab0bcd871b0b17c64caf45d147d27fb90465d43ef23bdde1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vruler-doc"

RDEPENDS:${PN} += ""

inherit rpm

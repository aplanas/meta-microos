SUMMARY = "Documentation for texlive-colorspace"
DESCRIPTION = "This package includes the documentation for texlive-colorspace"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn50585"

RPM_NAME = "texlive-colorspace-doc-2023.201.1.3svn50585-53.1.noarch.rpm"
RPM_HASH = "93d7ee1793dcb055307c682ad2a2695865b263b9c2b458cd360a265740f8d22bd6ddd0f726d83d076eeb3f47e24a55caf95e074922c410dc7d1b1cceabc685d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorspace-doc"
RDEPENDS:${PN} += ""

inherit rpm

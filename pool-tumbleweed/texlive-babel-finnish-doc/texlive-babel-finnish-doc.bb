SUMMARY = "Documentation for texlive-babel-finnish"
DESCRIPTION = "This package includes the documentation for texlive-babel-finnish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3ssvn57643"

RPM_NAME = "texlive-babel-finnish-doc-2023.209.1.3ssvn57643-54.1.noarch.rpm"
RPM_HASH = "5b16e05457ac90f657f2827ffd9104ecc82de9ac7749982a502c6fb0393dece8198a306bc4d0a20b064d9c47a5af4d6ce00a6544b9775939b9832daf6d9cccc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-finnish-doc"

RDEPENDS:${PN} += ""

inherit rpm

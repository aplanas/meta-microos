SUMMARY = "Documentation for texlive-latex-lab-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-lab-dev"
LICENSE = "LPPL-1.0"

PV = "2023.209.20230601_pre_release_2svn66513"

RPM_NAME = "texlive-latex-lab-dev-doc-2023.209.20230601_pre_release_2svn66513-56.1.noarch.rpm"
RPM_HASH = "af1562396d25f2994f1c18ad217fd49564ab05c83974d3ab82aceeb843de675d9f3c80f0aac1074152e86a75eec1595ab35934e89355bbc516f7b16551a77a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-lab-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm

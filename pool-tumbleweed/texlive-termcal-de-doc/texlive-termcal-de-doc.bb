SUMMARY = "Documentation for texlive-termcal-de"
DESCRIPTION = "This package includes the documentation for texlive-termcal-de"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn47111"

RPM_NAME = "texlive-termcal-de-doc-2023.201.2.0svn47111-54.1.noarch.rpm"
RPM_HASH = "2543b33235188f1748c1c179225282ba299762b1a56df31a52b74be35b91eda3a7a44f59a434f41b4b793778108c1c1591d5cda79394013d6a63ddddd053575e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termcal-de-doc"

RDEPENDS:${PN} += ""

inherit rpm

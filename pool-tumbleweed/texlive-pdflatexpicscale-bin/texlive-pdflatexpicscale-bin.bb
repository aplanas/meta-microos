SUMMARY = "Binary files of pdflatexpicscale"
DESCRIPTION = "Binary files of pdflatexpicscale"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41779"

RPM_NAME = "texlive-pdflatexpicscale-bin-2023.20230311.svn41779-93.2.aarch64.rpm"
RPM_HASH = "218f69640e62286c6fb135c42029e3e988348398bb2b5c9826d0c7b6fad8aa82dc57452b0813c19b970875b95bc1d0c776494c1ce8e249598e2bb3e013046832"

RPROVIDES:${PN} += "texlive-pdflatexpicscale-bin"

RDEPENDS:${PN} += "texlive-pdflatexpicscale"

inherit rpm

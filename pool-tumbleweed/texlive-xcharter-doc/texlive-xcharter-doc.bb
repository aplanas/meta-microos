SUMMARY = "Documentation for texlive-xcharter"
DESCRIPTION = "This package includes the documentation for texlive-xcharter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.24svn63057"

RPM_NAME = "texlive-xcharter-doc-2023.209.1.24svn63057-53.1.noarch.rpm"
RPM_HASH = "d07f95cbf6d6d2f343a4d8e76484383c35516d0596531988a3e5907f39c70ff2047adbde1f1d205d03843ace712b09a1700274a99d3bbbbabdfb5cca5878b1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm

SUMMARY = "Documentation for texlive-bidi-atbegshi"
DESCRIPTION = "This package includes the documentation for texlive-bidi-atbegshi"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn62009"

RPM_NAME = "texlive-bidi-atbegshi-doc-2023.209.0.0.2svn62009-54.1.noarch.rpm"
RPM_HASH = "9327d30f5d1295707e377b1ce19327cc51ea00a9722ada1d032e9d675e7d7b247c295557c932ce30c222730dc5e55234b812c62a79da31e37b50e71640ec88da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidi-atbegshi-doc"

RDEPENDS:${PN} += ""

inherit rpm

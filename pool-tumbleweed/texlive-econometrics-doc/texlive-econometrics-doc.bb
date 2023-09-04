SUMMARY = "Documentation for texlive-econometrics"
DESCRIPTION = "This package includes the documentation for texlive-econometrics"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39396"

RPM_NAME = "texlive-econometrics-doc-2023.209.1.0svn39396-54.2.noarch.rpm"
RPM_HASH = "dfcc22d01565d34fb358fa70e1f83ad0e9dbb5086ddedf8bd0071de47e9669cc7f52cddac2913e9ada938c073c4e7df040bec1d63bd19baeee594e8c189cba70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econometrics-doc"

RDEPENDS:${PN} += ""

inherit rpm

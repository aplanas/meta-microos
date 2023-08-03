SUMMARY = "Documentation for texlive-karnaugh-map"
DESCRIPTION = "This package includes the documentation for texlive-karnaugh-map"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn61614"

RPM_NAME = "texlive-karnaugh-map-doc-2023.209.2.0svn61614-56.1.noarch.rpm"
RPM_HASH = "42948b129054f9f5874b22444a510cf5bbb289b7988deb0af2784b6437bbc02846e29c620fb95c342fc5acbe4a023db0bc359195a7502d0b9d3699e2a835f068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-karnaugh-map-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-epspdf"
DESCRIPTION = "This package includes the documentation for texlive-epspdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6.5.1svn66115"

RPM_NAME = "texlive-epspdf-doc-2023.209.0.0.6.5.1svn66115-54.1.noarch.rpm"
RPM_HASH = "942328e79b796aa869965676dfeb3308ce15053b38a87ff8cad0581c269eb65285f2f116ef7dba1c54019207c8c751208a487773caa0bfb49490280dbe7be87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdf-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

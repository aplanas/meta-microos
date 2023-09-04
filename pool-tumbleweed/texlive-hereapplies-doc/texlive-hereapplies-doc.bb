SUMMARY = "Documentation for texlive-hereapplies"
DESCRIPTION = "This package includes the documentation for texlive-hereapplies"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.1svn65251"

RPM_NAME = "texlive-hereapplies-doc-2023.209.1.0.1svn65251-54.2.noarch.rpm"
RPM_HASH = "01a585e1d50948fd371da0939273a877af4b423c66e5442077aa7d0c77b2d597582588e9499543b728aa2c066e4e1985a94e54b07f678c55384a68ab1f3ac21a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hereapplies-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-zhmetrics"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics"
LICENSE = "LPPL-1.0"

PV = "2023.209.r206svn22207"

RPM_NAME = "texlive-zhmetrics-doc-2023.209.r206svn22207-53.1.noarch.rpm"
RPM_HASH = "44f3d5829a6b1254beec4e16c0736118b4584176bf7d9b654da9c3253e427cfc6b9be7b7fa7cc75a07c0c7651838edfabd8d8417f83c2793fc40bc7f2d232fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-doc"

RDEPENDS:${PN} += ""

inherit rpm

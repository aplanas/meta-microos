SUMMARY = "Documentation for texlive-datetime2-romanian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-romanian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn56394"

RPM_NAME = "texlive-datetime2-romanian-doc-2023.209.1.02svn56394-53.1.noarch.rpm"
RPM_HASH = "ab60910759eb36129a3e36fc7a2ee698788246dd22cc0d622f9474f28938ac742bbf6a0935d750a152782afae4827035e7b87404f381b04dd3183ad848fd9d8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-romanian-doc"

RDEPENDS:${PN} += ""

inherit rpm

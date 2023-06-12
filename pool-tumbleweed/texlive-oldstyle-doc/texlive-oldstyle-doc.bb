SUMMARY = "Documentation for texlive-oldstyle"
DESCRIPTION = "This package includes the documentation for texlive-oldstyle"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-oldstyle-doc-2023.201.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "92d59f41cef0e10fc8d08866e534823b39ee2ded43b315490fb297b708f923400eea45268dd3b3d89b42761c7c729a9fdf4d79a865ff5ba62d00a274ce328e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oldstyle-doc"
RDEPENDS:${PN} += ""

inherit rpm

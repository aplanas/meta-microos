SUMMARY = "Documentation for texlive-biblatex-vancouver"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-vancouver"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn55339"

RPM_NAME = "texlive-biblatex-vancouver-doc-2023.209.0.0.1svn55339-54.1.noarch.rpm"
RPM_HASH = "ef687ad0ecf8012be74ab1ba819db25af55b5bffda6855b6d10a3d945d5682813f3b0baf4f373d85de9f3185215bb8a6083cdcbe66e7a8d91b6a0cc449213e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-vancouver-doc"

RDEPENDS:${PN} += ""

inherit rpm

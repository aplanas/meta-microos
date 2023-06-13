SUMMARY = "Documentation for texlive-oberdiek"
DESCRIPTION = "This package includes the documentation for texlive-oberdiek"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65521"

RPM_NAME = "texlive-oberdiek-doc-2023.201.svn65521-54.1.noarch.rpm"
RPM_HASH = "b6af549e9aa7588797218c48feb13c329af8a1e42e3b46b00b211273bb8348fb2771ec0f47c9135345dc777e58db410cd56928fe492110eb0a33c172ee580a4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oberdiek-doc"

RDEPENDS:${PN} += ""

inherit rpm

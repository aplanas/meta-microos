SUMMARY = "Documentation for texlive-fixltxhyph"
DESCRIPTION = "This package includes the documentation for texlive-fixltxhyph"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn25832"

RPM_NAME = "texlive-fixltxhyph-doc-2023.201.0.0.4svn25832-52.1.noarch.rpm"
RPM_HASH = "a590bd4069e270731edda945dba1d2510ff127448d313823945c779834e1734e92cb3ec23cf75301962ae860d1cddd66d40c263f2bef752ed69154e829a44a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixltxhyph-doc"

RDEPENDS:${PN} += ""

inherit rpm

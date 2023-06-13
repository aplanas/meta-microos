SUMMARY = "Documentation for texlive-zxjafbfont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafbfont"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn28539"

RPM_NAME = "texlive-zxjafbfont-doc-2023.201.0.0.2svn28539-52.1.noarch.rpm"
RPM_HASH = "c00c2829b479122aa601108d2251f48a0a7c7bba977f6de2a87390e2d58805ce1d071ce3fc4d9e5461a5d12deada15b33ece61bab6f21a1b824f2c29b92c971c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zxjafbfont-doc"

RDEPENDS:${PN} += ""

inherit rpm

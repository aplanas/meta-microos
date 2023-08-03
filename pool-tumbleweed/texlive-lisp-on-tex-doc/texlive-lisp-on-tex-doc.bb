SUMMARY = "Documentation for texlive-lisp-on-tex"
DESCRIPTION = "This package includes the documentation for texlive-lisp-on-tex"
LICENSE = "BSD-3-Clause"

PV = "2023.209.2.0svn38722"

RPM_NAME = "texlive-lisp-on-tex-doc-2023.209.2.0svn38722-55.1.noarch.rpm"
RPM_HASH = "3a414dbfb72187d14963fab4ed9643f41ddcadb675c1360588266ad73c4e3bb209ee17049ec97256d5f7252e4ac8179e8f7d5fdf8999ce488cb34354862c69a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lisp-on-tex-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-tikz-ext"
DESCRIPTION = "This package includes the documentation for texlive-tikz-ext"
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.0.0.4.2svn64920"

RPM_NAME = "texlive-tikz-ext-doc-2023.209.0.0.4.2svn64920-53.1.noarch.rpm"
RPM_HASH = "bc9db0c36b9f5d6e6b17ffc413ae731b6b599c8e712b627a5deee9cf99f40f59cffe2c775a678e35e5fac8b13a2cca937c1b698412223d8b7a1859e54955d098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-ext-doc"

RDEPENDS:${PN} += ""

inherit rpm

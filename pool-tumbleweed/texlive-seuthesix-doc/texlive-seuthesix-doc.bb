SUMMARY = "Documentation for texlive-seuthesix"
DESCRIPTION = "This package includes the documentation for texlive-seuthesix"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.1svn40088"

RPM_NAME = "texlive-seuthesix-doc-2023.201.1.0.1svn40088-53.1.noarch.rpm"
RPM_HASH = "18708f2997b3ad82603e262e733b07afaf267e0584a5a832b2e62d064a0d2c18f934190dee0c9f49ab8cfe915a3a6f2e7695557eb09c80f23ff72dda7f41c7c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-seuthesix-doc-zh \
texlive-seuthesix-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-crossrefenum"
DESCRIPTION = "This package includes the documentation for texlive-crossrefenum"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.1.0.2svn66014"

RPM_NAME = "texlive-crossrefenum-doc-2023.204.1.0.2svn66014-54.1.noarch.rpm"
RPM_HASH = "b010c85341558214e0bb59d25f78a638ef68a92fe2cca98cf822414d62c6ffa2dde81daf7c3a63986d16469ef87741cea0d020976edbc69b4c3089afc10caac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossrefenum-doc"

RDEPENDS:${PN} += ""

inherit rpm

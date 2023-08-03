SUMMARY = "Documentation for texlive-thinsp"
DESCRIPTION = "This package includes the documentation for texlive-thinsp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn39669"

RPM_NAME = "texlive-thinsp-doc-2023.209.0.0.2svn39669-55.1.noarch.rpm"
RPM_HASH = "c869289cdc7c4b8400ff05a961b31128982da8426bf317b418d9d37b6b642ce2f2d14631469041f87c659fb17b6915f8a5c6afa11dcfad2d135d3fb6ce735069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thinsp-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-appendixnumberbeamer"
DESCRIPTION = "This package includes the documentation for texlive-appendixnumberbeamer"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2svn46317"

RPM_NAME = "texlive-appendixnumberbeamer-doc-2023.209.1.2svn46317-55.1.noarch.rpm"
RPM_HASH = "5f41d963c2e3dc9137380ad1f7d6ebdb7d96c77f0c39a355b19cc859929a49b182aeb743d64325219423a7df3b3ac7cd1d9a053448c90b991ff7fb447fe10500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-appendixnumberbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm

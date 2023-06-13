SUMMARY = "Documentation for texlive-appendixnumberbeamer"
DESCRIPTION = "This package includes the documentation for texlive-appendixnumberbeamer"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2svn46317"

RPM_NAME = "texlive-appendixnumberbeamer-doc-2023.201.1.2svn46317-54.1.noarch.rpm"
RPM_HASH = "2ddec0b40041a96322d6b0beb3b5dfd597ad1e85df4bb1e929db02a4e119767df13d7ab348d7c49031d158f6bb6e06591c9543a09578738feda3c0efe0c21454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-appendixnumberbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm

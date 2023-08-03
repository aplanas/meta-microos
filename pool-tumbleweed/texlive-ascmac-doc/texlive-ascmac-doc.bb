SUMMARY = "Documentation for texlive-ascmac"
DESCRIPTION = "This package includes the documentation for texlive-ascmac"
LICENSE = "BSD-3-Clause"

PV = "2023.209.2.1svn53411"

RPM_NAME = "texlive-ascmac-doc-2023.209.2.1svn53411-54.1.noarch.rpm"
RPM_HASH = "200db026166848e7c3f29877703ec2b36e1dfe1f84b57097186f25fdaae679c78fc728dd72a847d65a48329ac775fa5b3b5d8ca547db8b006aa87fbbf9dc0653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ascmac-doc-ja \
texlive-ascmac-doc"

RDEPENDS:${PN} += ""

inherit rpm

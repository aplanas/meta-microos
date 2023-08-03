SUMMARY = "Documentation for texlive-concprog"
DESCRIPTION = "This package includes the documentation for texlive-concprog"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn18791"

RPM_NAME = "texlive-concprog-doc-2023.209.svn18791-54.1.noarch.rpm"
RPM_HASH = "1ccddd0b1ca7459047c10dfe572cdcc518ab53334bcd482c96bfc8c670839ddbb9b414fd8d058cdc00b754236f96e864789d6988b9947881408990f8a48e3b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concprog-doc"

RDEPENDS:${PN} += ""

inherit rpm

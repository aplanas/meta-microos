SUMMARY = "Documentation for texlive-xcite"
DESCRIPTION = "This package includes the documentation for texlive-xcite"
LICENSE = "LPPL-1.0"

PV = "2023.201.16383.99998svn53486"

RPM_NAME = "texlive-xcite-doc-2023.201.16383.99998svn53486-52.2.noarch.rpm"
RPM_HASH = "b977464ae9931336cbc17ff3aabae7fe20ae949dc11215be811f2d796b10860a0ba858b5d8555d87fa58a6a4027a56f1d24c12c4b964a028c9c9a63073206328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcite-doc"

RDEPENDS:${PN} += ""

inherit rpm

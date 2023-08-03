SUMMARY = "Documentation for texlive-libris"
DESCRIPTION = "This package includes the documentation for texlive-libris"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.007svn19409"

RPM_NAME = "texlive-libris-doc-2023.209.1.007svn19409-55.1.noarch.rpm"
RPM_HASH = "1ea0c749b8dda23b2e8b76c99c911043dfc905710aabae35a3c9d8c1afe29aafdd6286458f92463afbf45a6193174841ad9c36e8b53159e03f606db997da992a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libris-doc"

RDEPENDS:${PN} += ""

inherit rpm

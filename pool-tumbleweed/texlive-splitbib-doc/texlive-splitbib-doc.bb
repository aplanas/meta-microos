SUMMARY = "Documentation for texlive-splitbib"
DESCRIPTION = "This package includes the documentation for texlive-splitbib"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.17svn15878"

RPM_NAME = "texlive-splitbib-doc-2023.201.1.17svn15878-57.1.noarch.rpm"
RPM_HASH = "074c1e43e00bb5aeb54d3073d9be035090b053e6fe32843faaa32f4cc81e6f8e8f72d5bc2c0cf9645116e903c182f0ef7af7d28ac0b59c3a4e18a5db1b72d656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-splitbib-doc"

RDEPENDS:${PN} += ""

inherit rpm

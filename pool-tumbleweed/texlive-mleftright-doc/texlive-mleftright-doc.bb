SUMMARY = "Documentation for texlive-mleftright"
DESCRIPTION = "This package includes the documentation for texlive-mleftright"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn53021"

RPM_NAME = "texlive-mleftright-doc-2023.209.1.2svn53021-55.1.noarch.rpm"
RPM_HASH = "0f43cd155be3efbdbccd6fa545cdb3ba9cd5e7bec456805e977b3ec7172f82292305bfb0a220006163de06d2e1899d1e93f8560f66bcfe8f5f8be22dcb95d78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mleftright-doc"

RDEPENDS:${PN} += ""

inherit rpm

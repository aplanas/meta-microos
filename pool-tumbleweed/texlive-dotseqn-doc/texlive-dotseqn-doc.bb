SUMMARY = "Documentation for texlive-dotseqn"
DESCRIPTION = "This package includes the documentation for texlive-dotseqn"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn17195"

RPM_NAME = "texlive-dotseqn-doc-2023.201.1.1svn17195-52.1.noarch.rpm"
RPM_HASH = "479adbdd23ca84912263633c1f46147aea099b256857183f3b80bb1e2a804517bf67aa8b1634492e8a1cf0c9c6e96f4d1f2cd31b6c41d41fda357d262b2bf107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dotseqn-doc"

RDEPENDS:${PN} += ""

inherit rpm

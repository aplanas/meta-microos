SUMMARY = "Documentation for texlive-keycommand"
DESCRIPTION = "This package includes the documentation for texlive-keycommand"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1415svn18042"

RPM_NAME = "texlive-keycommand-doc-2023.209.3.1415svn18042-56.1.noarch.rpm"
RPM_HASH = "c4859a757bc2192f2daa8879c0184ab2c43baa37d2fb37825cff3f6b22d0d3658c665a8ed050a793c95a2b80358202dfe55dfe278b978ce618ada13809724885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keycommand-doc"

RDEPENDS:${PN} += ""

inherit rpm

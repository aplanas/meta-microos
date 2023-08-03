SUMMARY = "Documentation for texlive-zennote"
DESCRIPTION = "This package includes the documentation for texlive-zennote"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn65549"

RPM_NAME = "texlive-zennote-doc-2023.209.1.0.0svn65549-53.1.noarch.rpm"
RPM_HASH = "da4bf9a118b687d1f652ead05b253f6db21858ab4ca198d76c64980c974b147fa09121a428195df0f29e052bd5b52c84097fe31f66e62785e0adbd2496a9f478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zennote-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-lcg"
DESCRIPTION = "This package includes the documentation for texlive-lcg"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn31474"

RPM_NAME = "texlive-lcg-doc-2023.209.1.3svn31474-55.1.noarch.rpm"
RPM_HASH = "564d947f6544f0c2b1b250e77effcb1ec6a8032f973cb32af5f1e86034bc0d63e2d4ebc03d787a3fd6e2c93885662cecd0e1cb9eabdadef3834b1ebdc2055e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lcg-doc"

RDEPENDS:${PN} += ""

inherit rpm

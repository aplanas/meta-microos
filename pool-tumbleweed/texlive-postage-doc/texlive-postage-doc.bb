SUMMARY = "Documentation for texlive-postage"
DESCRIPTION = "This package includes the documentation for texlive-postage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55920"

RPM_NAME = "texlive-postage-doc-2023.209.1.0svn55920-53.1.noarch.rpm"
RPM_HASH = "2cee9a8c98b55bd866a05d0e201d15ad5d752b443c4d8f56e3efcb131b678bda0030b3e68dd16795b47fe15809f70b73fc8fb2597f1504bf05949edfd859507b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-postage-doc"

RDEPENDS:${PN} += ""

inherit rpm

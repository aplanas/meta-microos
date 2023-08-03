SUMMARY = "Documentation for texlive-principia"
DESCRIPTION = "This package includes the documentation for texlive-principia"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn58927"

RPM_NAME = "texlive-principia-doc-2023.209.1.3svn58927-53.1.noarch.rpm"
RPM_HASH = "663ad3bf350a72201e480657e5e4f775db7a957cdf01e06eb939b92e121561275ff929528c6222095e63f00ae466e5ddc44093daf4a21e3bfc51f1fc1796521b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-principia-doc"

RDEPENDS:${PN} += ""

inherit rpm

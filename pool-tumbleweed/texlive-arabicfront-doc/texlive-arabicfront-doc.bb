SUMMARY = "Documentation for texlive-arabicfront"
DESCRIPTION = "This package includes the documentation for texlive-arabicfront"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn51474"

RPM_NAME = "texlive-arabicfront-doc-2023.201.1.1svn51474-54.1.noarch.rpm"
RPM_HASH = "f0799e24249cf3b75ea90c9837bd82b74fb9bd2ad1d64ef30bafa0779bfb1ecf2099a5faebb67aef06f09eb9d29b2324c974bc53beb4842221c79f32e0b8e8c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabicfront-doc"

RDEPENDS:${PN} += ""

inherit rpm

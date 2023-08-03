SUMMARY = "Documentation for texlive-pst-intersect"
DESCRIPTION = "This package includes the documentation for texlive-pst-intersect"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn33210"

RPM_NAME = "texlive-pst-intersect-doc-2023.209.0.0.4svn33210-53.1.noarch.rpm"
RPM_HASH = "f8a309850161a8e92d985ec98a95f06c7afa0b900feb17cb224c8eb91a3095b41d57f1a8edc292ebe70fa771401aba04ce256bf118c9921e668ab8b7d3341947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-intersect-doc-de;en \
texlive-pst-intersect-doc"

RDEPENDS:${PN} += ""

inherit rpm

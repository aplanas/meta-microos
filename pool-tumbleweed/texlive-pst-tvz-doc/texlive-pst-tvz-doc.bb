SUMMARY = "Documentation for texlive-pst-tvz"
DESCRIPTION = "This package includes the documentation for texlive-pst-tvz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn23451"

RPM_NAME = "texlive-pst-tvz-doc-2023.209.1.01svn23451-54.2.noarch.rpm"
RPM_HASH = "1e4e679767e157d468d1bd263ce9e614891b22c0eb42d80e5de2b23eb23f902f5ca9ec821b8d8afcbe6b6c8274323a23c85f6b1f7246ee8cf1398ee9b31f62d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tvz-doc"

RDEPENDS:${PN} += ""

inherit rpm

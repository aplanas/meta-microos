SUMMARY = "Documentation for texlive-yb-book"
DESCRIPTION = "This package includes the documentation for texlive-yb-book"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn64586"

RPM_NAME = "texlive-yb-book-doc-2023.209.0.0.2.0svn64586-53.1.noarch.rpm"
RPM_HASH = "da09da04efabe44071452be3c36570d8ac5b175f6cbaaa2860da25c8f47c34920c1ba14fd51de6948e553423202e289bfac76a16b2884588e7bda42e1e78af31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yb-book-doc"

RDEPENDS:${PN} += ""

inherit rpm

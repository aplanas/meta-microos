SUMMARY = "Documentation for texlive-denisbdoc"
DESCRIPTION = "This package includes the documentation for texlive-denisbdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.4svn66137"

RPM_NAME = "texlive-denisbdoc-doc-2023.209.0.0.9.4svn66137-53.1.noarch.rpm"
RPM_HASH = "0bcb58fb29fde73ed0986d017bb27abe2db8aaa0ad9e400c66fb7b8e3456715c9cce0272c53e249debf65f05a8eadfd76f01512386598c37c9d59ccfa40d2cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-denisbdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-auto-pst-pdf-lua"
DESCRIPTION = "This package includes the documentation for texlive-auto-pst-pdf-lua"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn54779"

RPM_NAME = "texlive-auto-pst-pdf-lua-doc-2023.209.0.0.03svn54779-54.1.noarch.rpm"
RPM_HASH = "feba2fd7c1869c3014f037f41b85bf29ea5a1f01818f9bd0b7574618548790a276434206e27155ff4da04dac437dbf934c33befc92e980222f56950ba698a786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-auto-pst-pdf-lua-doc"

RDEPENDS:${PN} += ""

inherit rpm

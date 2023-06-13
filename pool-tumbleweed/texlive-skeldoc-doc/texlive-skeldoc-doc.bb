SUMMARY = "Documentation for texlive-skeldoc"
DESCRIPTION = "This package includes the documentation for texlive-skeldoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.2svn57922"

RPM_NAME = "texlive-skeldoc-doc-2023.201.0.0.1.2svn57922-57.1.noarch.rpm"
RPM_HASH = "60f36b55df92366d78d3538014417fa9482cbc6fd734f6c433952ff5cb788287ab0964b440f7b7dd5af799e6fd4e15e094755f86b131e3eb83a136bd5ab03091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skeldoc-doc"

RDEPENDS:${PN} += ""

inherit rpm

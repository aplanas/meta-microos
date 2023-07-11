SUMMARY = "Documentation for texlive-glossaries-nynorsk"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-nynorsk"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55189"

RPM_NAME = "texlive-glossaries-nynorsk-doc-2023.201.1.0svn55189-53.2.noarch.rpm"
RPM_HASH = "4c6d77e6e281ab9e66941ab3afe0b363930bfdb5c785c55e7fa79f5898374c8a60b98109fd366286f3a3ce268cec0ef199494ac60d913db4ab6969072df0e28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-nynorsk-doc"

RDEPENDS:${PN} += ""

inherit rpm

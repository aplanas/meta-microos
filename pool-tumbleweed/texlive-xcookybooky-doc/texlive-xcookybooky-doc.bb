SUMMARY = "Documentation for texlive-xcookybooky"
DESCRIPTION = "This package includes the documentation for texlive-xcookybooky"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn36435"

RPM_NAME = "texlive-xcookybooky-doc-2023.201.1.5svn36435-52.2.noarch.rpm"
RPM_HASH = "b9b3f77fe1f4fcd7d51eb2637950db00f3d9b2f5449bd13c23d8ca5afde73b06b7afb19c3e0e627ad9d5c12905789e1dc02ce01bece7f07d55e5ea4e8f82daba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcookybooky-doc"

RDEPENDS:${PN} += ""

inherit rpm

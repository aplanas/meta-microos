SUMMARY = "Documentation for texlive-edfnotes"
DESCRIPTION = "This package includes the documentation for texlive-edfnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-doc-2023.201.0.0.6bsvn21540-53.1.noarch.rpm"
RPM_HASH = "441c361af6441f19a99e6251df61fe462190ef094aa5e0a9825e386346b9e4d49af5de62139ef1986665b5a1133c48259c0448a9171405775a7ab75ed13e2156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edfnotes-doc"
RDEPENDS:${PN} += ""

inherit rpm

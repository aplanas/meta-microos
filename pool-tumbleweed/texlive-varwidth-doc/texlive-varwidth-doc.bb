SUMMARY = "Documentation for texlive-varwidth"
DESCRIPTION = "This package includes the documentation for texlive-varwidth"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.92svn24104"

RPM_NAME = "texlive-varwidth-doc-2023.209.0.0.92svn24104-54.1.noarch.rpm"
RPM_HASH = "1995c7b141b82861e5335f9fa3a1c2585ecf002dfb8df8155813831c758bbe67d3b9cfff80c61009267fd1f989ca59c3e722feb38e4938ce3da2078dc2b42588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varwidth-doc"

RDEPENDS:${PN} += ""

inherit rpm

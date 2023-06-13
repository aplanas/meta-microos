SUMMARY = "Documentation for texlive-xcookybooky"
DESCRIPTION = "This package includes the documentation for texlive-xcookybooky"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn36435"

RPM_NAME = "texlive-xcookybooky-doc-2023.201.1.5svn36435-52.1.noarch.rpm"
RPM_HASH = "c4e79ff88da86e21e7812a64d1bc2978a01988a30f258b3127dc40a4b0a02d483e0bf9302b1579acd764b3313c060a4b4d2d3f5610bf4634288910be4a051d53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcookybooky-doc"

RDEPENDS:${PN} += ""

inherit rpm

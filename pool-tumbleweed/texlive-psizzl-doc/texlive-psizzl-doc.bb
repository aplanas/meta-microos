SUMMARY = "Documentation for texlive-psizzl"
DESCRIPTION = "This package includes the documentation for texlive-psizzl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.35svn15878"

RPM_NAME = "texlive-psizzl-doc-2023.209.0.0.35svn15878-53.1.noarch.rpm"
RPM_HASH = "833b0c170e0709e82fcdf97a6719be1d78a9342dfd88b121595c5cd5cff1738d7da9123dff1d636d7b78f6801f2397e0d25594b07751fb1fe27d3549cac46dc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psizzl-doc"

RDEPENDS:${PN} += ""

inherit rpm

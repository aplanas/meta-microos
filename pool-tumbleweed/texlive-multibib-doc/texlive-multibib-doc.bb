SUMMARY = "Documentation for texlive-multibib"
DESCRIPTION = "This package includes the documentation for texlive-multibib"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn15878"

RPM_NAME = "texlive-multibib-doc-2023.201.1.4svn15878-54.1.noarch.rpm"
RPM_HASH = "46d5c1df12f85d478044732d232a8fe82a422ffe88a53a7c7c064a21a5ab9a363e36d3f23223262d1235937dc6ff8b8b0da136822d752d78d9e1d46999c15a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multibib-doc"
RDEPENDS:${PN} += ""

inherit rpm

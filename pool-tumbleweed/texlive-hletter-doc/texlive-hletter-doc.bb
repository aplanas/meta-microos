SUMMARY = "Documentation for texlive-hletter"
DESCRIPTION = "This package includes the documentation for texlive-hletter"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn30002"

RPM_NAME = "texlive-hletter-doc-2023.209.4.2svn30002-54.1.noarch.rpm"
RPM_HASH = "d8f2ac8aec46b84b63e0763f81d2da5856778c9d515728e55bed81ed1f977c881f288e867ef5d9d604e7a4aac1cb2df7bab1f27283c91bae5c8c1ca029b5dbc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hletter-doc"

RDEPENDS:${PN} += ""

inherit rpm

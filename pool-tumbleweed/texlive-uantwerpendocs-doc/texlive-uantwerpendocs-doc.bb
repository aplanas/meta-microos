SUMMARY = "Documentation for texlive-uantwerpendocs"
DESCRIPTION = "This package includes the documentation for texlive-uantwerpendocs"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.4svn64165"

RPM_NAME = "texlive-uantwerpendocs-doc-2023.209.4.4svn64165-53.1.noarch.rpm"
RPM_HASH = "62892dd6026537461da0519e14cdc2044a3ae718bc44c145ddb706e40379a840e2c01bb55da9b7fb50c91e7afe91926f8b37ac039ad41d3820ec61ab4cd78b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uantwerpendocs-doc"

RDEPENDS:${PN} += ""

inherit rpm

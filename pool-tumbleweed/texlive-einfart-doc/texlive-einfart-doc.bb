SUMMARY = "Documentation for texlive-einfart"
DESCRIPTION = "This package includes the documentation for texlive-einfart"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65475"

RPM_NAME = "texlive-einfart-doc-2023.209.svn65475-54.1.noarch.rpm"
RPM_HASH = "cc5f6fc8cc821c6db1439c64f4b9c676526f7213c5efd990249c8f5ed19658f828c72bbaf3d46dae4f728d7cd3cfab07e2d044ad07ce0290c856344af9215718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-einfart-doc"

RDEPENDS:${PN} += ""

inherit rpm

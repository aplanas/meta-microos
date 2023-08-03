SUMMARY = "Documentation for texlive-apacite"
DESCRIPTION = "This package includes the documentation for texlive-apacite"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.03svn54080"

RPM_NAME = "texlive-apacite-doc-2023.209.6.03svn54080-55.1.noarch.rpm"
RPM_HASH = "6e0a36573267523d4d33df46f94bbd8abd2ebcfe8b93f57e4e171c2b9e48b68501ba3f16b9bb41110de828931ce4b4b078a41bd968d0af8319261a5087d5052d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apacite-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-morehype"
DESCRIPTION = "This package includes the documentation for texlive-morehype"
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.83svn38815"

RPM_NAME = "texlive-morehype-doc-2023.201.r0.83svn38815-54.1.noarch.rpm"
RPM_HASH = "14ad2acea6c9f5caf2e37264ef0537273ac766f9ffec20fc97c3100c6563cfb7a0b349509dcbc53175e54c518ab4154c3bbe2422c12b8e505988b08d2731bc04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-morehype-doc"

RDEPENDS:${PN} += ""

inherit rpm

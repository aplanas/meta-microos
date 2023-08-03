SUMMARY = "Documentation for texlive-uri"
DESCRIPTION = "This package includes the documentation for texlive-uri"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn48602"

RPM_NAME = "texlive-uri-doc-2023.209.2.0bsvn48602-54.1.noarch.rpm"
RPM_HASH = "20e9756f3c96eef586c27e3a0298cd11d73a950fbb132f81f28c53748f1eae4780c512f9a7427b6072132aff1151e5387caf67788f153650cd021a26f9ba892f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uri-doc"

RDEPENDS:${PN} += ""

inherit rpm

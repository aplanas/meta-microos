SUMMARY = "Documentation for texlive-image-gallery"
DESCRIPTION = "This package includes the documentation for texlive-image-gallery"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0jsvn15878"

RPM_NAME = "texlive-image-gallery-doc-2023.209.1.0jsvn15878-54.1.noarch.rpm"
RPM_HASH = "f9b4b89cc945f6db4a2feaa57a421ef0dfa10b9f223164b65e44be756476a700b7d1b454c16dec4dd436f183ba49e461df4be4ae20325d3bf6fa56ba40114a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-image-gallery-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-iitem"
DESCRIPTION = "This package includes the documentation for texlive-iitem"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn29613"

RPM_NAME = "texlive-iitem-doc-2023.209.1.0svn29613-54.1.noarch.rpm"
RPM_HASH = "66a33514bc8fcf54f44a1613be3880aa844f20e3bd427fdef8084dce9ce862f7fadc63af379df356016cd9510ae63563da0a9a3266ac4fe9d4a493bdfa977b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iitem-doc"

RDEPENDS:${PN} += ""

inherit rpm

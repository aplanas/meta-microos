SUMMARY = "Documentation for texlive-williams"
DESCRIPTION = "This package includes the documentation for texlive-williams"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-williams-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "fb66efb570702151e87f99fbe83b7bda12a6dd7ede0c4d653a3ee3f4e4bd9616389c0e04e7e7e0a5f5eddcf0706e98529c26e6012a1ffebaa5d17117214a811e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-williams-doc"

RDEPENDS:${PN} += ""

inherit rpm

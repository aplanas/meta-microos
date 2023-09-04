SUMMARY = "Documentation for texlive-ifmslide"
DESCRIPTION = "This package includes the documentation for texlive-ifmslide"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.47svn20727"

RPM_NAME = "texlive-ifmslide-doc-2023.209.0.0.47svn20727-54.1.noarch.rpm"
RPM_HASH = "88cfac529cbb07a518cf0642c79112abdfd622be6e42e53ae05b9d04b62ecc19b577cd1cd4022046494635ba2291560c27e9b0501f28626e9b77d8877cccb60d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifmslide-doc"

RDEPENDS:${PN} += ""

inherit rpm

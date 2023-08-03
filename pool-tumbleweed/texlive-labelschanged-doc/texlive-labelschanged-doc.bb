SUMMARY = "Documentation for texlive-labelschanged"
DESCRIPTION = "This package includes the documentation for texlive-labelschanged"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn46040"

RPM_NAME = "texlive-labelschanged-doc-2023.209.1.0svn46040-56.1.noarch.rpm"
RPM_HASH = "c341fb4d2206e95de611c72824d6a6c7d72f5aa989793efccac136e740d5ecc96bd316367bfe9b8480c9fab8c6931e7f2dbf774d0ae1c8f8cfb8a41ea08e4ddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labelschanged-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-datetime2-swedish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-swedish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36700"

RPM_NAME = "texlive-datetime2-swedish-doc-2023.209.1.0svn36700-53.1.noarch.rpm"
RPM_HASH = "e8bab215b5c60d040d8eba7013c47e568eeb4ab8ee2ce07ebe45beb7172041f5204f3c5f4e55415f9b5b69be2d1fb89ab09fdcf6e7cc439c19e764acff8cc712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-swedish-doc"

RDEPENDS:${PN} += ""

inherit rpm

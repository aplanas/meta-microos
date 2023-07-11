SUMMARY = "Documentation for texlive-lualinalg"
DESCRIPTION = "This package includes the documentation for texlive-lualinalg"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn65834"

RPM_NAME = "texlive-lualinalg-doc-2023.208.1.2svn65834-53.1.noarch.rpm"
RPM_HASH = "2da9ed6a48188d9697c87a2bcb945d8553c2471535a7bdbb54a2b839a3a83cd04373950b4542c8d71f03e85630e4f751edfd4288186fa4c51c45ef2163b4e7fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualinalg-doc"

RDEPENDS:${PN} += ""

inherit rpm

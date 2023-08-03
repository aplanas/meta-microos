SUMMARY = "Documentation for texlive-beamerauxtheme"
DESCRIPTION = "This package includes the documentation for texlive-beamerauxtheme"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02asvn56087"

RPM_NAME = "texlive-beamerauxtheme-doc-2023.209.1.02asvn56087-54.1.noarch.rpm"
RPM_HASH = "d7fc7b934facb1572cd0762648ee9c64b06f6b865fb1df30672d92432b4b0c1aef4f9a4d22e0ba142bd8e9fbc2c60ca710602574c209ea03a67aaf50d544a1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerauxtheme-doc"

RDEPENDS:${PN} += ""

inherit rpm

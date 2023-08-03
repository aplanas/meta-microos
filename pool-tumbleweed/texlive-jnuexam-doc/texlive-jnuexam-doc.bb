SUMMARY = "Documentation for texlive-jnuexam"
DESCRIPTION = "This package includes the documentation for texlive-jnuexam"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56867"

RPM_NAME = "texlive-jnuexam-doc-2023.209.1.0svn56867-56.1.noarch.rpm"
RPM_HASH = "bd7e86d6ba54632df8c6b3172bfe2bf59588a4a6547e23f9fc753698e0396f60cb63914a77827dc7f374b930d867aea8c9858d0311c4da417ac6a32a740b4d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jnuexam-doc-zh \
texlive-jnuexam-doc"

RDEPENDS:${PN} += ""

inherit rpm

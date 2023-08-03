SUMMARY = "Documentation for texlive-srdp-mathematik"
DESCRIPTION = "This package includes the documentation for texlive-srdp-mathematik"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11.0svn65293"

RPM_NAME = "texlive-srdp-mathematik-doc-2023.209.1.11.0svn65293-58.1.noarch.rpm"
RPM_HASH = "892225ff4d5fa022e0806f41982f188d8411c210ae4792fa102cc09a2a28c8310af9643263d7053adbf8fac0f67aab4f11bc51a2c86c6d658eeae99d449996e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-srdp-mathematik-doc-de-at \
texlive-srdp-mathematik-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-perltex"
DESCRIPTION = "This package includes the documentation for texlive-perltex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn52162"

RPM_NAME = "texlive-perltex-doc-2023.201.2.2svn52162-51.1.noarch.rpm"
RPM_HASH = "33962966f0722d2daa2daad819ee99448425dbf85a2b0f6640f053d61cab8c81034de7e656d105ecdbd6572852699bda274e5608e707b099917799828f0d7c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-perltex.1 \
texlive-perltex-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-volumes"
DESCRIPTION = "This package includes the documentation for texlive-volumes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-volumes-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "adbf5607285cbc7832c64aead34fdf89bf007c1a1a0cc4035980448452eb60a00f92f8cc7b342f97c1a6f4a64ad590a30873df3a744778b8165700a1d0f9665b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-volumes-doc"

RDEPENDS:${PN} += ""

inherit rpm

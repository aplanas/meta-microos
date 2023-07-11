SUMMARY = "Documentation for texlive-pxbase"
DESCRIPTION = "This package includes the documentation for texlive-pxbase"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn66187"

RPM_NAME = "texlive-pxbase-doc-2023.201.1.4svn66187-53.2.noarch.rpm"
RPM_HASH = "601f61a0d4fb0970d468232313a3b0f46df3d5f116c9c1cf7f2d1915e4385ecac7177b4b5f03d0f48927f4fa4fb7347362ed107e53e1605e8f5a88e55c716f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxbase-doc-ja \
texlive-pxbase-doc"

RDEPENDS:${PN} += ""

inherit rpm

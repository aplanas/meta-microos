SUMMARY = "Documentation for texlive-impnattypo"
DESCRIPTION = "This package includes the documentation for texlive-impnattypo"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.5svn50227"

RPM_NAME = "texlive-impnattypo-doc-2023.208.1.5svn50227-53.1.noarch.rpm"
RPM_HASH = "7136834b03b2ba195c286cdef07a85790b17f7142f6d69ac04057cf13f6d7b3e7d050af9fa2b75203716d7fa2865f4f3919d329a48c8f626cc22c04597815a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-impnattypo-doc-fr;en \
texlive-impnattypo-doc"

RDEPENDS:${PN} += ""

inherit rpm

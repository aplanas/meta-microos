SUMMARY = "Documentation for texlive-wrapfig"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn61719"

RPM_NAME = "texlive-wrapfig-doc-2023.209.3.6svn61719-53.2.noarch.rpm"
RPM_HASH = "e553799bf9871bbf065a3ae91d247dd7824864faebaf2cb679e675893bf9a8ac68d6d316659e6a6908bae1ec45c781cb7b5484ec52e12a97dd3ab6ba0beb5518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-verifiche"
DESCRIPTION = "This package includes the documentation for texlive-verifiche"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn64425"

RPM_NAME = "texlive-verifiche-doc-2023.209.6.0svn64425-54.1.noarch.rpm"
RPM_HASH = "2adcbcf8d5625edb55503983a363810ae2ee9e1d8aff596c7f33e04ad5f522e80c8213e413a5c9f45e5de9fa97d6a4434c330ebcc6ee41642f46e29d730e8d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-verifiche-doc-it \
texlive-verifiche-doc"

RDEPENDS:${PN} += ""

inherit rpm

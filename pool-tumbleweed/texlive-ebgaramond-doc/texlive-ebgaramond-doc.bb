SUMMARY = "Documentation for texlive-ebgaramond"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64343"

RPM_NAME = "texlive-ebgaramond-doc-2023.209.svn64343-54.1.noarch.rpm"
RPM_HASH = "63212425ce1b01b791ff26f28ee4ac7a8b9e9e8c6344d998ad6091bcf89b22e6976698eac114acc2ef5f09970da1ec51537d3d2b1214e999b895f98c49b58841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-doc"

RDEPENDS:${PN} += ""

inherit rpm

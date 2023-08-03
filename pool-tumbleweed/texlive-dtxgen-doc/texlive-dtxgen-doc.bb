SUMMARY = "Documentation for texlive-dtxgen"
DESCRIPTION = "This package includes the documentation for texlive-dtxgen"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.08svn51663"

RPM_NAME = "texlive-dtxgen-doc-2023.209.1.08svn51663-53.1.noarch.rpm"
RPM_HASH = "57c1d569bb5732cd53d652698fe1bd7cec546b2d5c703822be75d3a3262eeb0ab4a91a805403e7b5fb859d0d1ccae84e5a840c35cb1a6ead2a54ccdd9f45cf7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxgen-doc"

RDEPENDS:${PN} += ""

inherit rpm

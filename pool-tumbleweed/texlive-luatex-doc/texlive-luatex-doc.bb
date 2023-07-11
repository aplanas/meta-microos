SUMMARY = "Documentation for texlive-luatex"
DESCRIPTION = "This package includes the documentation for texlive-luatex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn66546"

RPM_NAME = "texlive-luatex-doc-2023.208.svn66546-53.1.noarch.rpm"
RPM_HASH = "1c3ddad849fec40ed8e42c71e314067c0eb4486c7ad5e0104df55c636333a4ea3b53627f43a6329a48464bb215e2100244dc2b7dc2aca95a38aeef089689b9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dviluatex.1 \
man-luatex.1 \
man-texlua.1 \
man-texluac.1 \
texlive-luatex-doc"

RDEPENDS:${PN} += ""

inherit rpm

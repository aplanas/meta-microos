SUMMARY = "Documentation for texlive-hyph-utf8"
DESCRIPTION = "This package includes the documentation for texlive-hyph-utf8"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn61719"

RPM_NAME = "texlive-hyph-utf8-doc-2023.208.svn61719-53.1.noarch.rpm"
RPM_HASH = "ad0f43f44193951a62c51cc5c47f6337cb2c2ebc444819849936eba36e482a30301066ae87c676f8d1c093a66bd55e92e7fec7f79e9026f3751fa09187247720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hyph-utf8-doc-en \
texlive-hyph-utf8-doc"

RDEPENDS:${PN} += ""

inherit rpm

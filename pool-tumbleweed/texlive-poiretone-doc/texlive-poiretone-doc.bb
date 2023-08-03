SUMMARY = "Documentation for texlive-poiretone"
DESCRIPTION = "This package includes the documentation for texlive-poiretone"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64856"

RPM_NAME = "texlive-poiretone-doc-2023.209.svn64856-53.1.noarch.rpm"
RPM_HASH = "8eb9f7fb98c7037d7c2b36b305fffc22d08da8331bc9549e3200519333146a1e280e0d4a944a5f6afa12cfebe7a5def4e9e33f2accfb3507de03d133155e640a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poiretone-doc"

RDEPENDS:${PN} += ""

inherit rpm

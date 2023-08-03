SUMMARY = "Documentation for texlive-greenpoint"
DESCRIPTION = "This package includes the documentation for texlive-greenpoint"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-greenpoint-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "0d0f2d5ee83d3bc9cba724af87f5c1010f5a5d5b8cbdc52a78793cae90f45a9d7cb1b2d60a751b0cad71df34e2e3290a48ba3278e33b23dea4f5f00d7f8e5408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greenpoint-doc"

RDEPENDS:${PN} += ""

inherit rpm

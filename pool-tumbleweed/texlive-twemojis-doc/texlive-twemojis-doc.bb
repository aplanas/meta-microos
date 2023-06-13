SUMMARY = "Documentation for texlive-twemojis"
DESCRIPTION = "This package includes the documentation for texlive-twemojis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1_twemoji_v14.0.1svn62930"

RPM_NAME = "texlive-twemojis-doc-2023.201.1.3.1_twemoji_v14.0.1svn62930-52.1.noarch.rpm"
RPM_HASH = "6bd57529bc1f9f86aa93a0dc647b27d7e1092a7c6aab368c9b24ca8d2c5a0621a2fb2000a9bcff6346f7ddd669f9d208d38c6c7ab599c27159c62254ea5058c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twemojis-doc"

RDEPENDS:${PN} += ""

inherit rpm

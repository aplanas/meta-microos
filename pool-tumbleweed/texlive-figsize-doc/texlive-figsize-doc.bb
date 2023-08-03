SUMMARY = "Documentation for texlive-figsize"
DESCRIPTION = "This package includes the documentation for texlive-figsize"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn18784"

RPM_NAME = "texlive-figsize-doc-2023.209.0.0.1svn18784-53.1.noarch.rpm"
RPM_HASH = "c3e5f9ce5989b8bca878ae6aa7d473e0c48d3cbb1df021c39a7988bd74157aac10391e68d3abd23bb63a0f995dff4eb4d6539707bc1080057be24b2dd30da1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figsize-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-jknapltx"
DESCRIPTION = "This package includes the documentation for texlive-jknapltx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn19440"

RPM_NAME = "texlive-jknapltx-doc-2023.209.svn19440-56.1.noarch.rpm"
RPM_HASH = "87040617216bd2971116195c10733532ccfa4a31564f2ef28814c9cb5cd5332460ce685e9ad3ffb99f22b58f12df3a7b3377ae31d4d9a62d6d2d3f94b352c48c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jknapltx-doc"

RDEPENDS:${PN} += ""

inherit rpm

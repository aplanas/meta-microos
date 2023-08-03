SUMMARY = "Documentation for texlive-hlist"
DESCRIPTION = "This package includes the documentation for texlive-hlist"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn44983"

RPM_NAME = "texlive-hlist-doc-2023.209.0.0.11svn44983-54.1.noarch.rpm"
RPM_HASH = "6a59a60215371f5f0724c781e3132d38980dcf475e3a77a0b82f2a4c69fffc06ab993e43c3e1dac503fa5246c023c0f3b6ad4f701a9ad0070ff9b6b9a9edee53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hlist-doc"

RDEPENDS:${PN} += ""

inherit rpm

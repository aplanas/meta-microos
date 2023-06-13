SUMMARY = "Documentation for texlive-datetime2-esperanto"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-esperanto"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47356"

RPM_NAME = "texlive-datetime2-esperanto-doc-2023.201.1.1svn47356-52.1.noarch.rpm"
RPM_HASH = "57bbb56b546ac8eff6299f421df42c326e709837379037459a78fb0c0350efc0544b74a9188c97cd8b22140371a03a02c0384216cd8c6af24939923f54af2d1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-esperanto-doc"

RDEPENDS:${PN} += ""

inherit rpm

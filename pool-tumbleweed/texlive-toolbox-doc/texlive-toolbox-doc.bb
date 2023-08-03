SUMMARY = "Documentation for texlive-toolbox"
DESCRIPTION = "This package includes the documentation for texlive-toolbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.1svn32260"

RPM_NAME = "texlive-toolbox-doc-2023.209.5.1svn32260-53.1.noarch.rpm"
RPM_HASH = "5fc14bcb2f365887f1cfdc4e97a9a5bf7c6ebd42f8ffb203d7d12b5025a271455cc7a156d7d362e8d96735af68a2f7bccca4b1ca66ec13fed2f747a55e4a4ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-toolbox-doc"

RDEPENDS:${PN} += ""

inherit rpm

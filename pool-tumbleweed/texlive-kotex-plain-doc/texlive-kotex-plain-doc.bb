SUMMARY = "Documentation for texlive-kotex-plain"
DESCRIPTION = "This package includes the documentation for texlive-kotex-plain"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.0svn63689"

RPM_NAME = "texlive-kotex-plain-doc-2023.209.3.0.0svn63689-56.1.noarch.rpm"
RPM_HASH = "72b1da310a592cf6000473de86fcf79510018379eb0e4e13c6ed8d0e69371ace2f9f60f57f4f036e39fb0fbde427e0e4f9b9d36ba884503d58e584490b49aef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kotex-plain-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-sourcecodepro"
DESCRIPTION = "This package includes the documentation for texlive-sourcecodepro"
LICENSE = "OFL-1.1"

PV = "2023.209.2.7svn54512"

RPM_NAME = "texlive-sourcecodepro-doc-2023.209.2.7svn54512-58.1.noarch.rpm"
RPM_HASH = "679d90a8b01b3b573134a428ef291c91655129a25b59364c9f47ef7fd4aa6bb31acea69a07bbd5771ef1dc320db94e398406ba68901a619b36bacdc6f7f566fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sourcecodepro-doc"

RDEPENDS:${PN} += ""

inherit rpm

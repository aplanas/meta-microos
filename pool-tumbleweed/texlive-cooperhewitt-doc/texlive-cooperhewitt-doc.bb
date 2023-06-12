SUMMARY = "Documentation for texlive-cooperhewitt"
DESCRIPTION = "This package includes the documentation for texlive-cooperhewitt"
LICENSE = "OFL-1.1"

PV = "2023.204.svn64967"

RPM_NAME = "texlive-cooperhewitt-doc-2023.204.svn64967-54.1.noarch.rpm"
RPM_HASH = "c792ef1bd0ace4b4259af9cbe708e866cdefc8c964adff19f5b3f965f39b6819a8cdafaf89cf9a1845e071735afe85c512274c95458d451f3a0aad3d5207f0d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooperhewitt-doc"
RDEPENDS:${PN} += ""

inherit rpm

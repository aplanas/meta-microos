SUMMARY = "Documentation for texlive-xetex-itrans"
DESCRIPTION = "This package includes the documentation for texlive-xetex-itrans"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-doc-2023.201.4.2svn55475-52.1.noarch.rpm"
RPM_HASH = "c10d21e8e6bb3312eec696686bb3546c7d9987ba5607cdc8e364bb657cd15b8fd72ab3f1a8f91acc574791f56a6d89014506af913ed6c5969e9a60ee1ce6cc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-itrans-doc"

RDEPENDS:${PN} += ""

inherit rpm

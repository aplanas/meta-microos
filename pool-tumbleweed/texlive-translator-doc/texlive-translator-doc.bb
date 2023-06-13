SUMMARY = "Documentation for texlive-translator"
DESCRIPTION = "This package includes the documentation for texlive-translator"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12dsvn59412"

RPM_NAME = "texlive-translator-doc-2023.201.1.12dsvn59412-52.1.noarch.rpm"
RPM_HASH = "67fd35ecff28aefc9a6d838b7c7041fb8202fc39f7567326d327bf0ceb4f49a8f0ede91998e6ead85425a2be25c163d686d2bc8139739892dee9a8a0ae6c6b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translator-doc"

RDEPENDS:${PN} += ""

inherit rpm

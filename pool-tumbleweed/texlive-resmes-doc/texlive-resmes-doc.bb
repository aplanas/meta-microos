SUMMARY = "Documentation for texlive-resmes"
DESCRIPTION = "This package includes the documentation for texlive-resmes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65375"

RPM_NAME = "texlive-resmes-doc-2023.201.1.0svn65375-53.1.noarch.rpm"
RPM_HASH = "d6f43d37c7b8c3a34f5b6617ac501f5eb1bc7695cd29740c4a21740f821c212266ee1de9bb5abd5367524b8cc71118921c8380e48187fcd1ddda88adb2dd2d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resmes-doc"

RDEPENDS:${PN} += ""

inherit rpm

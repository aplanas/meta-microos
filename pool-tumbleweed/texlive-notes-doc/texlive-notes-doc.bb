SUMMARY = "Documentation for texlive-notes"
DESCRIPTION = "This package includes the documentation for texlive-notes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn42428"

RPM_NAME = "texlive-notes-doc-2023.209.1.0.1svn42428-55.1.noarch.rpm"
RPM_HASH = "d18bcdc21e4036c42d0b141ddb147da5cc88308c0e84d1e247b171ff26496d5349709118f2ae09f5fb1f4ba3c7e6be727933783e20d02af4caab81aa33de3891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notes-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-gitstatus"
DESCRIPTION = "This package includes the documentation for texlive-gitstatus"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64662"

RPM_NAME = "texlive-gitstatus-doc-2023.209.1.1svn64662-54.1.noarch.rpm"
RPM_HASH = "00d39ae22bf2a67f1f8e635cb38b80dae6b192a68d5fa2727cb0e4e1809bba9c97ddaf316021fbddbe3fcdec9afe1e2d0f33387d9e17f1df98596a07ee85198d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitstatus-doc"

RDEPENDS:${PN} += ""

inherit rpm

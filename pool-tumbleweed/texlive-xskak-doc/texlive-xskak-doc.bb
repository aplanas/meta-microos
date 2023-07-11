SUMMARY = "Documentation for texlive-xskak"
DESCRIPTION = "This package includes the documentation for texlive-xskak"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn51432"

RPM_NAME = "texlive-xskak-doc-2023.201.1.5svn51432-52.2.noarch.rpm"
RPM_HASH = "b75276a203ab8c80b74cdd427a9f6fd47ebf96b995ee0f2146fab17a71f80b4fb6373de73a3641aefd64d5f26653a71bc7cf9d1a122ab7cbd63be5b3cd57399a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xskak-doc"

RDEPENDS:${PN} += ""

inherit rpm

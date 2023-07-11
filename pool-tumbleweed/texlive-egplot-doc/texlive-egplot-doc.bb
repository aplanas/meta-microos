SUMMARY = "Documentation for texlive-egplot"
DESCRIPTION = "This package includes the documentation for texlive-egplot"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02asvn20617"

RPM_NAME = "texlive-egplot-doc-2023.201.1.02asvn20617-53.2.noarch.rpm"
RPM_HASH = "7e563b6e5057c046c8a6d7c3d49736333efe8b88c8d0a78eb8f502c8d9cf460a4d2dbe4bd33d89ceecce9950099fb912a7c87368fd10d7d484649e94e8b1a8f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egplot-doc"

RDEPENDS:${PN} += ""

inherit rpm

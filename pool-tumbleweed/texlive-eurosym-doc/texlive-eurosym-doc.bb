SUMMARY = "Documentation for texlive-eurosym"
DESCRIPTION = "This package includes the documentation for texlive-eurosym"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4_subrfixsvn17265"

RPM_NAME = "texlive-eurosym-doc-2023.201.1.4_subrfixsvn17265-52.1.noarch.rpm"
RPM_HASH = "c00afe504b79dc7c4958c73a13a1b3944a4f58b5a3ecb46c2a7ff8830f20241feeb03f52c8c458721863c5a189ea658c1671b0e38593ed8ec012401211e0f8ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eurosym-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm

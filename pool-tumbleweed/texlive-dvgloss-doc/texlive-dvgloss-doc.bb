SUMMARY = "Documentation for texlive-dvgloss"
DESCRIPTION = "This package includes the documentation for texlive-dvgloss"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-doc-2023.209.0.0.1svn29103-54.1.noarch.rpm"
RPM_HASH = "8f929550a55d4d201bede73980f2ef35ecd919daeb25b33487098b9433158b800ca80805e4361c842216debc3f8ae22e78694b5a0803cddf4420c4a4c008c098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dvgloss-doc"

RDEPENDS:${PN} += ""

inherit rpm

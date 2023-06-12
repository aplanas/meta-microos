SUMMARY = "Documentation for texlive-autofancyhdr"
DESCRIPTION = "This package includes the documentation for texlive-autofancyhdr"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn54049"

RPM_NAME = "texlive-autofancyhdr-doc-2023.201.0.0.1svn54049-53.1.noarch.rpm"
RPM_HASH = "78bfd11b82fb6f3ec20796743f7259a2cc969c75915a2eec707c608611a2d34fa06c9522b4bc93d99b75daa7387869efba662cbf43f31d5d50d4b7d34e58cec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autofancyhdr-doc"
RDEPENDS:${PN} += ""

inherit rpm

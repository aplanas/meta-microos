SUMMARY = "Documentation for texlive-fontinst"
DESCRIPTION = "This package includes the documentation for texlive-fontinst"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.933svn62517"

RPM_NAME = "texlive-fontinst-doc-2023.209.1.933svn62517-53.1.noarch.rpm"
RPM_HASH = "4c3439aca3eb3292d1c4b7b23492614273e4bc04971ba105cf437a0e21136f323620f2404eff6b9a8ff62a59c7c73c54dc82cf9fd0eda62a31c1c20f7285fa23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-fontinst.1 \
texlive-fontinst-doc"

RDEPENDS:${PN} += ""

inherit rpm

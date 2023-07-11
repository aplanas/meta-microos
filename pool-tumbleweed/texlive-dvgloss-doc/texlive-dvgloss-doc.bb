SUMMARY = "Documentation for texlive-dvgloss"
DESCRIPTION = "This package includes the documentation for texlive-dvgloss"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-doc-2023.201.0.0.1svn29103-53.2.noarch.rpm"
RPM_HASH = "b6c396e87c7b783ad10f657432acac03c825f5f1561029446ec9721137dc4ba4db3ff5041980e631573a54ab74f97f6836394274734405c94b860919eecba1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dvgloss-doc"

RDEPENDS:${PN} += ""

inherit rpm

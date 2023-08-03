SUMMARY = "Documentation for texlive-latexdemo"
DESCRIPTION = "This package includes the documentation for texlive-latexdemo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn55265"

RPM_NAME = "texlive-latexdemo-doc-2023.209.0.0.1svn55265-55.1.noarch.rpm"
RPM_HASH = "24772cf88c9d21bd8ee0841c4c505287c77dd94adb21d0c976e469f707cebcd45da6252ecfdf63e85fc70bdae1b174bdb9aa23f1f341c07aec3d9f5277331b1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexdemo-doc"

RDEPENDS:${PN} += ""

inherit rpm

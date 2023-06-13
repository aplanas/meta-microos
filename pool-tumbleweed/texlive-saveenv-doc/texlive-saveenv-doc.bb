SUMMARY = "Documentation for texlive-saveenv"
DESCRIPTION = "This package includes the documentation for texlive-saveenv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1svn65346"

RPM_NAME = "texlive-saveenv-doc-2023.201.0.0.0.1svn65346-53.1.noarch.rpm"
RPM_HASH = "67254ee5adc1a1ce1fd180e6055de53bc90f1ad7f71cbbe90d33011416179bf0dc71f3ca319886483abbd0e72ca81f697bb17f40466faf4f3f7de6240c045bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-saveenv-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-tikzviolinplots"
DESCRIPTION = "This package includes the documentation for texlive-tikzviolinplots"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.1svn65687"

RPM_NAME = "texlive-tikzviolinplots-doc-2023.209.0.0.7.1svn65687-53.1.noarch.rpm"
RPM_HASH = "27a83758b0072f31ef1715bec1151b06a96abd4be450144fc556257f32bc400278746b8ae764e5d379e6d786814fb5896fb6d785d64a8e4f15e1d81405d6202c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzviolinplots-doc"

RDEPENDS:${PN} += ""

inherit rpm

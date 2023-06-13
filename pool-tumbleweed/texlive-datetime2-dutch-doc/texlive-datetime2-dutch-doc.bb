SUMMARY = "Documentation for texlive-datetime2-dutch"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-dutch"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47355"

RPM_NAME = "texlive-datetime2-dutch-doc-2023.201.1.1svn47355-52.1.noarch.rpm"
RPM_HASH = "32ef5e41089ca0b364d314f178d128e5da44eefb32ac4f3b41e15b5124ade022fa8928da2969d31e192452236d25b4e21938a6f0c3d21c31a962a4a5488afe04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-dutch-doc"

RDEPENDS:${PN} += ""

inherit rpm

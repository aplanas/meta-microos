SUMMARY = "Documentation for texlive-context-rst"
DESCRIPTION = "This package includes the documentation for texlive-context-rst"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-rst-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "8ebc40bb4d601f839a0acdabd9773ca3b11a385a49ea83aef732d3621f063c7f50132c27dacaad4a2323da59f6f6c51e0db0210a5df765b5aef30bc965f91e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-rst-doc"

RDEPENDS:${PN} += ""

inherit rpm

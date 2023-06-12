SUMMARY = "Documentation for texlive-draftfigure"
DESCRIPTION = "This package includes the documentation for texlive-draftfigure"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn44854"

RPM_NAME = "texlive-draftfigure-doc-2023.201.0.0.2svn44854-52.1.noarch.rpm"
RPM_HASH = "7de14f67acdf4dd3cdc3cda188b92b2b09139e37f669b235656ba53d3e607b9e9361ad56ac2e63b6a7c3d76e431f78181a10bc50ab5cf28985969e7d4307eabb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-draftfigure-doc"
RDEPENDS:${PN} += ""

inherit rpm

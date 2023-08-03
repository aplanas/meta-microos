SUMMARY = "Documentation for texlive-biblatex-socialscienceshuberlin"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-socialscienceshuberlin"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1svn47839"

RPM_NAME = "texlive-biblatex-socialscienceshuberlin-doc-2023.209.0.0.0.1svn47839-54.1.noarch.rpm"
RPM_HASH = "ce925fd84986491b23a028bb907ddf59b4a3496bb0c4ae6381a70102ef4ae79826a8a7629c3a088e94132d62dfc8e6a451fb232111e8280395fd0abdf7594bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-socialscienceshuberlin-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-coloring"
DESCRIPTION = "This package includes the documentation for texlive-coloring"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn41042"

RPM_NAME = "texlive-coloring-doc-2023.209.0.0.2svn41042-54.1.noarch.rpm"
RPM_HASH = "c31350a996eafbe64079e594f63b59bfdfbe0abc674d434380ac13ecb4015487c00e0a6e4a9d431ce2293232a8226d60f84564ff6dd984f7095ba59886b626f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coloring-doc"

RDEPENDS:${PN} += ""

inherit rpm

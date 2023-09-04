SUMMARY = "Documentation for texlive-pxjodel"
DESCRIPTION = "This package includes the documentation for texlive-pxjodel"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn64072"

RPM_NAME = "texlive-pxjodel-doc-2023.209.0.0.3svn64072-54.2.noarch.rpm"
RPM_HASH = "f9f628432950ec53e2676dd810912fd5380a588dec36745e8bc1b7a83df6df2d8cdfe7d9f84df46d8c371d1530cf3328cf307dcbf140e13b5b40caaedebb5a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxjodel-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-context-gnuplot"
DESCRIPTION = "This package includes the documentation for texlive-context-gnuplot"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-gnuplot-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "0788d98720caf60bb1511c911c0f7ec43a5351e554674e8db141550f3644a7ee2d2215c02831824410f114ed063f327bda3139e8143b62a944e244d8fe5c583d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-gnuplot-doc"

RDEPENDS:${PN} += ""

inherit rpm

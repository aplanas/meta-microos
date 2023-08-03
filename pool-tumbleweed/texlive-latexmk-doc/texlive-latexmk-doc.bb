SUMMARY = "Documentation for texlive-latexmk"
DESCRIPTION = "This package includes the documentation for texlive-latexmk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.79svn65485"

RPM_NAME = "texlive-latexmk-doc-2023.209.4.79svn65485-55.1.noarch.rpm"
RPM_HASH = "149fe3d1ac03d57a18420706fc546bdbcc9a6783dc967b38d3f14ba4223c73ea782e55c4579d5a6632f0218f6d848e94a184052d4c64d534df15990dbf42a789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latexmk.1 \
texlive-latexmk-doc"

RDEPENDS:${PN} += "/usr/bin/csh \
/usr/bin/sh"

inherit rpm

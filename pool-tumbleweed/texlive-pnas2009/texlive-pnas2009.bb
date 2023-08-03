SUMMARY = "BibTeX style for PNAS (newer version)"
DESCRIPTION = "This style produces bibliographies in the format of \
'Proceedings of the National Academy of Sciences, USA'. The \
style was derived from the standard unsrt.bst and adapted to \
the new (2009) formatting rules."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn16287"

RPM_NAME = "texlive-pnas2009-2023.209.1.0svn16287-53.1.noarch.rpm"
RPM_HASH = "392bb3e031dd05f42ceb5d04554ea7a7760dd4b390997b829714a34392a693a7af59bd8c30ab2c91b00f4f514ded46a42b539a5a790e18c6efb6f401b2ddca59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pnas2009"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

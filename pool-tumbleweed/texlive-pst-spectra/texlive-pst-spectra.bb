SUMMARY = "Draw continuum, emission and absorption spectra with PSTricks"
DESCRIPTION = "The package is a PSTricks extension, based on a NASA lines \
database. It allows you to draw continuum, emission and \
absorption spectra. A Total of 16 880 visible lines from 99 \
elements can be displayed. The package requires the xkeyval \
package for decoding its arguments."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-2023.209.0.0.91svn15878-54.2.noarch.rpm"
RPM_HASH = "5a55b34a09fcdd8346026028a81c1b7dcb623d9d76e01faca1f72930c728861146b8de1903f62852e18df53bc4b07b2f5a6b707961743d3c8426c397ba8e91f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-spectra.sty \
tex-pst-spectra.tex \
texlive-pst-spectra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pstricks.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

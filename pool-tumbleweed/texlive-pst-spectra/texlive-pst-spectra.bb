SUMMARY = "Draw continuum, emission and absorption spectra with PSTricks"
DESCRIPTION = "The package is a PSTricks extension, based on a NASA lines \
database. It allows you to draw continuum, emission and \
absorption spectra. A Total of 16 880 visible lines from 99 \
elements can be displayed. The package requires the xkeyval \
package for decoding its arguments."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-2023.201.0.0.91svn15878-53.2.noarch.rpm"
RPM_HASH = "ec73cd4c2a1e80d535c3bb3a1990b694c5821c2ed580a615cd1d1d0a1ea0d6a37a724527593dfa56941953065066ec49e9a25aa2c579c1acf6a6bf88d6da561b"
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

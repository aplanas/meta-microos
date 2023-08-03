SUMMARY = "Draw continuum, emission and absorption spectra with PSTricks"
DESCRIPTION = "The package is a PSTricks extension, based on a NASA lines \
database. It allows you to draw continuum, emission and \
absorption spectra. A Total of 16 880 visible lines from 99 \
elements can be displayed. The package requires the xkeyval \
package for decoding its arguments."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-2023.209.0.0.91svn15878-54.1.noarch.rpm"
RPM_HASH = "20f2e18693741701f97527601fa3c85c98bbc2cace860d20fc1a87d5d2b7dbb12119218e5800245818d265c3f8caeb1b965fa82e2e063b12bf9b06e66de8c8b2"
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

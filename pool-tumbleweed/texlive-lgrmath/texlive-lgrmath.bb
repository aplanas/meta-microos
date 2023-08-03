SUMMARY = "Use LGR-encoded fonts in math mode"
DESCRIPTION = "The lgrmath package is a LaTeX package which sets the Greek \
letters in math mode to use glyphs from the LGR-encoded font of \
one's choice. The documentation includes a rather extensive \
list of the available font family names on typical LaTeX \
installations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65038"

RPM_NAME = "texlive-lgrmath-2023.209.1.0svn65038-55.1.noarch.rpm"
RPM_HASH = "dcf4ea57119fec7a3e2e9b6ec2d1343313ecf2a1b771d4c56b8df1182ceab1df76d0b1c30abbd42d156602228ed57b7ea84ac7390e8a190954bd544a1e6681ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lgrmath.sty \
texlive-lgrmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

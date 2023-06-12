SUMMARY = "BibTeX style for the Journal of Neuroscience"
DESCRIPTION = "This is a slightly modified version of the namedplus style, \
which fully conforms with the Journal of Neuroscience citation \
style. It should be characterised as an author-date citation \
style; a BibTeX style and a LaTeX package are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn17346"

RPM_NAME = "texlive-jneurosci-2023.201.1.00svn17346-55.1.noarch.rpm"
RPM_HASH = "68c11e9836b1145b652712dec5e57ae91c2ddd0f3e823082dd32f324abc767ebd9ca1f349c6c9e08d6fec5da8bc35606700bf9c5772f7d34ff9c11c324595018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jneurosci.sty) \
texlive-jneurosci"
RDEPENDS:${PN} += "/bin/sh \
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

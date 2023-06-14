SUMMARY = "David Carlisle's small packages"
DESCRIPTION = "Many of David Carlisle's more substantial packages stand on \
their own, or as part of the LaTeX latex-tools set; this set \
contains: Making dotless 'j' characters for fonts that don't \
have them; A method for combining the capabilities of longtable \
and tabularx; An environment for including Plain TeX in LaTeX \
documents; A jiffy to remove counters from other counters' \
reset lists (now obsolete as it has been incorporated into the \
LaTeX format); A jiffy to create 'slashed' characters for \
physicists."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59577"

RPM_NAME = "texlive-carlisle-2023.201.svn59577-52.1.noarch.rpm"
RPM_HASH = "24a082c4f6d4f96377190ac7194ab8aef2883e2ee792d9fe4d94766623a3bbd58129c4eb023af41159b1d7bbd2c69cb27bd33096ec3d437d39a9460f34f398b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dotlessj.sty \
tex-ltxtable.sty \
tex-plain.sty \
tex-remreset.sty \
tex-scalefnt.sty \
tex-slashed.sty \
texlive-carlisle"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-longtable.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

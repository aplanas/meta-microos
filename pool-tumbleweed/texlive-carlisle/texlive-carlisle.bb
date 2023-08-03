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

PV = "2023.209.svn59577"

RPM_NAME = "texlive-carlisle-2023.209.svn59577-53.1.noarch.rpm"
RPM_HASH = "e736d133be40d28cbe3aaacbb87d1c8858b106f4e1fd92cbf3fe8c7c5d8112ad30df7e608aab5418a71833d6fe47adde0fec09a184a2d8fbc25ab6e4e20e0888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dotlessj.sty \
tex-ltxtable.sty \
tex-plain.sty \
tex-remreset.sty \
tex-scalefnt.sty \
tex-slashed.sty \
texlive-carlisle"

RDEPENDS:${PN} += "/usr/bin/sh \
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

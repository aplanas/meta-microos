SUMMARY = "A TeX labelling package"
DESCRIPTION = "Pinlabel is a labelling package for attaching perfectly \
formatted TeX labels to figures and diagrams in both eps and \
pdf formats. It is suitable both for labelling a new diagram \
and for relabelling an existing diagram. The package uses \
coordinates derived from GhostView (or gv) and labels are \
placed with automatic and consistent spacing relative to the \
object labelled."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn24769"

RPM_NAME = "texlive-pinlabel-2023.201.1.2svn24769-51.1.noarch.rpm"
RPM_HASH = "46aec843c285528a33a510e1a61052505855eec51c2d371722559fc21dfa06290a410a64ec040ed2324d1eac449907db879f7671fa7929e995c7189c215afc28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pinlabel.sty \
texlive-pinlabel"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Use URW's clone of Zapf Chancery as a maths alphabet"
DESCRIPTION = "The package allows (the URW clone of) Zapf Chancery to function \
as a maths alphabet, the target of \\mathcal or \\mathscr, with \
accents appearing where they should, and other spacing \
parameters set to reasonable (not very tight) values. The font \
itself may be found in the URW basic fonts collection. This \
package supersedes the pzccal package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn21701"

RPM_NAME = "texlive-urwchancal-2023.209.1svn21701-54.1.noarch.rpm"
RPM_HASH = "0049c02d398181f513823fa954d51173918439bbab478ad2acd7f7800ebf71fe2ee77336d081eefdbc4caccf5ce3655f9935914ec05772cc38f90e033288a599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-urwchancal.sty \
tex-urwchancal.tfm \
tex-urwchancal.vf \
tex-uurwchancal.fd \
texlive-urwchancal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

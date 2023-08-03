SUMMARY = "A font for the Cherokee script"
DESCRIPTION = "The Cherokee script was designed in 1821 by Segwoya. The \
alphabet is essentially syllabic, only 6 characters (a e i o s \
u) correspond to Roman letters: the font encodes these to the \
corresponding roman letter. The remaining 79 characters have \
been arbitrarily encoded in the range 38-122; the cherokee \
package provides commands that map each such syllable to the \
appropriate character; for example, Segwoya himself would be \
represented \\Cse\\Cgwo\\Cya. The font is distributed as Metafont \
source; it works very poorly in modern environments, and could \
do with expert attention (if you are interested, please contact \
the CTAN team for details)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21046"

RPM_NAME = "texlive-cherokee-2023.209.svn21046-54.1.noarch.rpm"
RPM_HASH = "90881e70c0599bfd7237ced02c72e91d54a154fcb755e17e48734518658f78131f981f623f7ecb48292652daf52edb49242c889963736be8d8414cfb2cf19058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cherokee.sty \
tex-cherokee.tfm \
texlive-cherokee"

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

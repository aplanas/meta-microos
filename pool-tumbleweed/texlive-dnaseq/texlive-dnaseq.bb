SUMMARY = "Format DNA base sequences"
DESCRIPTION = "Defines a means of specifying sequences of bases. The bases may \
be numbered (per line) and you may specify that subsequences be \
coloured. For a more 'vanilla-flavoured' way of typesetting \
base sequences, the user might consider the seqsplit package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn17194"

RPM_NAME = "texlive-dnaseq-2023.209.0.0.01svn17194-53.1.noarch.rpm"
RPM_HASH = "2a46e838992c7d6b8026cde07a8a277ee538c7619abf97c6131f7a79e20942a2c6e5d9dd7e64caae3c0b82f16817d5681e91d717e212ed6a538c02c2d570d184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dnaseq.sty \
texlive-dnaseq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

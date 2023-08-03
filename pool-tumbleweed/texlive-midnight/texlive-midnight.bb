SUMMARY = "A set of useful macro tools"
DESCRIPTION = "Included are: quire: making booklets, etc.; gloss: vertically \
align words in consecutive sentences; loop: a looping \
construct; dolines: 'meta'-macros to separate arguments by \
newlines; labels: address labels and bulk mail letters; \
styledef: selectively input part of a file; and border: borders \
around boxes."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-midnight-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "fb3b40cbc3506fe4058b9c79a63a52f9fd0120af35e5780ec2216176f15d087502b2f66ddcbb323be6838979eb0ab3c9404b285658a0ac5f5367c9d7eb7d20fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-border.tex \
tex-dolines.tex \
tex-gloss.tex \
tex-labels.tex \
tex-loop.tex \
tex-quire.tex \
tex-styledef.tex \
texlive-midnight"

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

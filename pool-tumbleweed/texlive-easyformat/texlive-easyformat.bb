SUMMARY = "Easily add boldface, italics and smallcaps"
DESCRIPTION = "This package allows the use of underscores and circumflexes to \
begin resp. end italic, bold or SMALLCAPS formatting, as an \
alternative to the standard LaTeX \\textit{...}, \\textbf{...} \
and/or \\textsc{...}. The meaning of underscore and circumflex \
in mathmode remain the same."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-2023.209.1.4.0svn44543-54.2.noarch.rpm"
RPM_HASH = "65fb6fd81eb4f37271721297ea49aaaa34fb25025814fee2445722702cdfc9c6acabdd9f4658db084ef280825bc65b8520c5a00615f18debfa8e81b0ca8a7de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easyformat.sty \
texlive-easyformat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

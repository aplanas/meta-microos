SUMMARY = "Easily add boldface, italics and smallcaps"
DESCRIPTION = "This package allows the use of underscores and circumflexes to \
begin resp. end italic, bold or SMALLCAPS formatting, as an \
alternative to the standard LaTeX \\textit{...}, \\textbf{...} \
and/or \\textsc{...}. The meaning of underscore and circumflex \
in mathmode remain the same."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-2023.209.1.4.0svn44543-54.1.noarch.rpm"
RPM_HASH = "a4e80d841169a69a0d2b8a8841d7759c5832a196dbf9c131dc514456becedf9786141e9798324512504d621194b92d1451482f36954152567f50350294d8395c"
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

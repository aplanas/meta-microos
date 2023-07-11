SUMMARY = "Easily add boldface, italics and smallcaps"
DESCRIPTION = "This package allows the use of underscores and circumflexes to \
begin resp. end italic, bold or SMALLCAPS formatting, as an \
alternative to the standard LaTeX \\textit{...}, \\textbf{...} \
and/or \\textsc{...}. The meaning of underscore and circumflex \
in mathmode remain the same."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-2023.201.1.4.0svn44543-53.2.noarch.rpm"
RPM_HASH = "2f65868b27ef7e825901a9a1905f8612c81df3e1031cb023d68120d5f9ddd1da824bdaeaf976df31fdf240ddabd22b71a38e500d86420dc1dd3dc3c9db93ee3c"
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

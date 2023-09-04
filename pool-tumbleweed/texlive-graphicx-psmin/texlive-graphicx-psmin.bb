SUMMARY = "Reduce size of PostScript files by not repeating images"
DESCRIPTION = "The package is an extension of the standard latex-graphics \
bundle and provides a way to include repeated PostScript \
graphics (ps, eps) only once in a PostScript document. This \
leads to smaller PostScript documents when having, for \
instance, a logo on every page. The package only works when \
post-processed with dvips, which should be version 5.95b or \
later. The difference for a resulting distilled PDF file is \
minimal (as Ghostscript and Adobe Distiller only include a \
single copy of each graphics file, anyway)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn56931"

RPM_NAME = "texlive-graphicx-psmin-2023.209.1.2svn56931-54.2.noarch.rpm"
RPM_HASH = "9d43fc7da1ee36bf6f60cc7ec8f436486901f70b4d3512c3c923ff596dceed8608847f1f7619e89da8781ec3dca12fcac07bbebcc5bd767a3a86e3fa02cc2257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphicx-psmin.sty \
texlive-graphicx-psmin"

RDEPENDS:${PN} += "/usr/bin/sh \
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

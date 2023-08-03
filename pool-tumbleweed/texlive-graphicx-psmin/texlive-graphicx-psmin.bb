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

RPM_NAME = "texlive-graphicx-psmin-2023.209.1.2svn56931-54.1.noarch.rpm"
RPM_HASH = "7cd9b7add467ca04b8a3f45a37c6eb43589539da40f697d0bb12201d154ac3bfa0d35fafcbc217332085fc8116948a7b5e566072bc12b48ca6d037bf5cc2fd7b"
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

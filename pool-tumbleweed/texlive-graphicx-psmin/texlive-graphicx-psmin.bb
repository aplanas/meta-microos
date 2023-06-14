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

PV = "2023.201.1.2svn56931"

RPM_NAME = "texlive-graphicx-psmin-2023.201.1.2svn56931-53.1.noarch.rpm"
RPM_HASH = "86bca3b99e28edea5233cc14ef6563135f2e72430cae8cd836d8ae562626dbdd118e51a1fcb8156bd5e2d601ed385fe44cef6b15785470b776549fcf2c471e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphicx-psmin.sty \
texlive-graphicx-psmin"

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

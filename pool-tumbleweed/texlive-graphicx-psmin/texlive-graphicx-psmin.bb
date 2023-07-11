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

RPM_NAME = "texlive-graphicx-psmin-2023.201.1.2svn56931-53.2.noarch.rpm"
RPM_HASH = "d526faf542a6790ba5ceb0b37fc6486c08e020deb7519af5ae3abec7c33c79b1a979d1aa821cc4c6ffb378724543c51e9875a47f87e234a123a69d1bda3299e6"
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

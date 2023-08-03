SUMMARY = "Support for designing posters on large paper"
DESCRIPTION = "Provides fonts in sizes of 12pt up to 107pt and also makes sure \
that in math formulas the symbols appear in the right size. Can \
also create a PostScript header file for dvips which ensures \
that the poster will be printed in the right size. Supported \
sizes are DIN A0, DIN A1, DIN A2 and DIN A3."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.22bsvn54071"

RPM_NAME = "texlive-a0poster-2023.209.1.22bsvn54071-55.1.noarch.rpm"
RPM_HASH = "a101f4a3d1cb01e239f573748db13536be7ab7e510821aff48e32767029ae86d361147c2e02596eb0caaf5dc61b40e104943c8ddad5e85f7677c8ce9ad2881bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a0poster.cls \
tex-a0size.sty \
texlive-a0poster"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

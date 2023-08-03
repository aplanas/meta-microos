SUMMARY = "Support for the Danish 'Dania' phonetic system"
DESCRIPTION = "Fonetika Dania is a font bundle with a serif font and a sans \
serif font for the danish phonetic system Dania. Both fonts \
exist in regular and bold weights. LaTeX support is provided. \
The fonts are based on URW Palladio and Iwona Condensed, and \
were created using FontForge."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21326"

RPM_NAME = "texlive-fonetika-2023.209.svn21326-53.1.noarch.rpm"
RPM_HASH = "ef815b48571345d5f7b52e760179f48692d1197a2e7d4437eee2836a09b3c64b58e906c14f727f7a5e06949c2bd77b1288483138574f3c037d28ac4d1a3e527e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fonetika.map \
tex-fonetika.sty \
tex-fonetika.tfm \
tex-fonetikabold.tfm \
tex-fonetikasans.tfm \
tex-fonetikasansbold.tfm \
tex-t1fonetika.fd \
texlive-fonetika"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-fonetika-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

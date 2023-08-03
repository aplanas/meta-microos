SUMMARY = "Some symbols created using TikZ"
DESCRIPTION = "The package provides various emoticons, cooking symbols and \
trees."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.12asvn61300"

RPM_NAME = "texlive-tikzsymbols-2023.209.4.12asvn61300-53.1.noarch.rpm"
RPM_HASH = "1268eabdad2bd1b7d5bc58b94faa3265ebf7b520fe5afedfaac45976c227185e6fd3c4675015c26bf0cc9633afe6cfeb3654c47418d47138411e1efee89128ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzsymbols.sty \
texlive-tikzsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

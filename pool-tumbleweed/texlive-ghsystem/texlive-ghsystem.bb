SUMMARY = "Globally harmonised system of chemical (etc) naming"
DESCRIPTION = "The package provides the means to typeset all the hazard and \
precautionary statements and pictograms in a straightforward \
way. The statements are taken from EU regulation 1272/2008."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.8csvn53822"

RPM_NAME = "texlive-ghsystem-2023.209.4.8csvn53822-53.1.noarch.rpm"
RPM_HASH = "542e36464f2903eb6f0df0f0e7aa656b7aa3997619e0d35664c514211377160c2060ea87374b654f7c4d1b487a3f57feb3be508887f40575b655b4cbe535715b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ghsystem-acid-8.tex \
tex-ghsystem-acid.tex \
tex-ghsystem-aqpol.tex \
tex-ghsystem-bottle-2-black.tex \
tex-ghsystem-bottle-2-white.tex \
tex-ghsystem-bottle.tex \
tex-ghsystem-english.def \
tex-ghsystem-exclam.tex \
tex-ghsystem-explos-1.tex \
tex-ghsystem-explos-2.tex \
tex-ghsystem-explos-3.tex \
tex-ghsystem-explos-4.tex \
tex-ghsystem-explos-5.tex \
tex-ghsystem-explos-6.tex \
tex-ghsystem-explos.tex \
tex-ghsystem-flame-2-black.tex \
tex-ghsystem-flame-2-white.tex \
tex-ghsystem-flame-3-black.tex \
tex-ghsystem-flame-3-white.tex \
tex-ghsystem-flame-4-1.tex \
tex-ghsystem-flame-4-2.tex \
tex-ghsystem-flame-4-3-black.tex \
tex-ghsystem-flame-4-3-white.tex \
tex-ghsystem-flame-5-2-black.tex \
tex-ghsystem-flame-5-2-white.tex \
tex-ghsystem-flame-O-5-1.tex \
tex-ghsystem-flame-O.tex \
tex-ghsystem-flame.tex \
tex-ghsystem-french.def \
tex-ghsystem-german.def \
tex-ghsystem-health.tex \
tex-ghsystem-italian.def \
tex-ghsystem-langtemplate.def \
tex-ghsystem-skull-2.tex \
tex-ghsystem-skull-6.tex \
tex-ghsystem-skull.tex \
tex-ghsystem-spanish.def \
tex-ghsystem.sty \
texlive-ghsystem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemmacros.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-longtable.sty \
tex-siunitx.sty \
tex-translations.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

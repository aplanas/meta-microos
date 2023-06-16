SUMMARY = "Globally harmonised system of chemical (etc) naming"
DESCRIPTION = "The package provides the means to typeset all the hazard and \
precautionary statements and pictograms in a straightforward \
way. The statements are taken from EU regulation 1272/2008."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.8csvn53822"

RPM_NAME = "texlive-ghsystem-2023.201.4.8csvn53822-52.1.noarch.rpm"
RPM_HASH = "6bfcdc9adb86b032493ca387376ed650a3a36a37f0ac772dd8bb4a69cb68181c39ec4433fc0320576e898f9cb1090c7b05e4e0f63b15ecfa38412e5e122392ba"
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

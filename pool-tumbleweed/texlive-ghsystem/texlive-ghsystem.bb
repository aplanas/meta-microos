SUMMARY = "Globally harmonised system of chemical (etc) naming"
DESCRIPTION = "The package provides the means to typeset all the hazard and \
precautionary statements and pictograms in a straightforward \
way. The statements are taken from EU regulation 1272/2008."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.8csvn53822"

RPM_NAME = "texlive-ghsystem-2023.201.4.8csvn53822-52.1.noarch.rpm"
RPM_HASH = "6bfcdc9adb86b032493ca387376ed650a3a36a37f0ac772dd8bb4a69cb68181c39ec4433fc0320576e898f9cb1090c7b05e4e0f63b15ecfa38412e5e122392ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ghsystem.sty) \
tex(ghsystem_acid-8.tex) \
tex(ghsystem_acid.tex) \
tex(ghsystem_aqpol.tex) \
tex(ghsystem_bottle-2-black.tex) \
tex(ghsystem_bottle-2-white.tex) \
tex(ghsystem_bottle.tex) \
tex(ghsystem_english.def) \
tex(ghsystem_exclam.tex) \
tex(ghsystem_explos-1.tex) \
tex(ghsystem_explos-2.tex) \
tex(ghsystem_explos-3.tex) \
tex(ghsystem_explos-4.tex) \
tex(ghsystem_explos-5.tex) \
tex(ghsystem_explos-6.tex) \
tex(ghsystem_explos.tex) \
tex(ghsystem_flame-2-black.tex) \
tex(ghsystem_flame-2-white.tex) \
tex(ghsystem_flame-3-black.tex) \
tex(ghsystem_flame-3-white.tex) \
tex(ghsystem_flame-4-1.tex) \
tex(ghsystem_flame-4-2.tex) \
tex(ghsystem_flame-4-3-black.tex) \
tex(ghsystem_flame-4-3-white.tex) \
tex(ghsystem_flame-5-2-black.tex) \
tex(ghsystem_flame-5-2-white.tex) \
tex(ghsystem_flame-O-5-1.tex) \
tex(ghsystem_flame-O.tex) \
tex(ghsystem_flame.tex) \
tex(ghsystem_french.def) \
tex(ghsystem_german.def) \
tex(ghsystem_health.tex) \
tex(ghsystem_italian.def) \
tex(ghsystem_langtemplate.def) \
tex(ghsystem_skull-2.tex) \
tex(ghsystem_skull-6.tex) \
tex(ghsystem_skull.tex) \
tex(ghsystem_spanish.def) \
texlive-ghsystem"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(chemmacros.sty) \
tex(expl3.sty) \
tex(graphicx.sty) \
tex(ifpdf.sty) \
tex(longtable.sty) \
tex(siunitx.sty) \
tex(translations.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

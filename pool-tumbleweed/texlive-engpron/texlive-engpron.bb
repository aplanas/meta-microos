SUMMARY = "Helps to type the pronunciation of English words"
DESCRIPTION = "This package provides macros beginning with the PS character, \
made active, which enable us to write the British or American \
English pronunciation as one can find it in the 'English \
Pronouncing Dictionary' by Daniel Jones. There is an option to \
typeset the pronunciation in the style of Harrap's dictionary."
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn16558"

RPM_NAME = "texlive-engpron-2023.209.2svn16558-54.1.noarch.rpm"
RPM_HASH = "754ddadbef9318e30ccd8338576395fab60c3e4636ea917facb7acaa3fcb857be412a6cdd938be0048a7ec751304dd6e51b1b6a15479398571c5e4d24417dc6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engpron-tools.sty \
tex-engpron.sty \
texlive-engpron"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-drac.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-tipa.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

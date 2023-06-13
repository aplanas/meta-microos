SUMMARY = "Replacement for the LaTeX classes"
DESCRIPTION = "A set of replacements for the default LaTeX classes, based upon \
the Koma-Script bundle and the seminar class. Includes hcart, \
hcreport, hcletter, and hcslides."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-hc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "450ee6cbcf5e75789aa955170d71752acaa922488f659efddf5d4496ca37f58ce2b6f2e7db9b1b5bd192433652afc29ff614163e6ce6988d4e90971dae6bfb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hcart.cls) \
tex(hcletter.cls) \
tex(hcreport.cls) \
tex(hcslides.cls) \
texlive-hc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(fancybox.sty) \
tex(fancyref.sty) \
tex(fontenc.sty) \
tex(ifthen.sty) \
tex(inputenc.sty) \
tex(mathpple.sty) \
tex(multicol.sty) \
tex(natbib.sty) \
tex(palatino.sty) \
tex(pifont.sty) \
tex(truncate.sty) \
tex(typearea.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

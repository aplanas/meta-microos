SUMMARY = "A personal dirty package for documenting packages"
DESCRIPTION = "A personal dirty package for documenting packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.4svn66137"

RPM_NAME = "texlive-denisbdoc-2023.209.0.0.9.4svn66137-53.1.noarch.rpm"
RPM_HASH = "f1ea21579bf86f6012616071a1ae718dc09eabd3c15de7dedf865ea26ca86b7bf3aa690cdecf1a2d4a3297adc2ea94861df5329678b3c63807b725bbef2273e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-denisbdoc.sty \
texlive-denisbdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-afterpage.sty \
tex-amssymb.sty \
tex-attachfile2.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-cleveref.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-datetime2.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fixfoot.sty \
tex-fontawesome.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-glossaries-extra.sty \
tex-hologo.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-iflang.sty \
tex-ifpdf.sty \
tex-imakeidx.sty \
tex-l3keys2e.sty \
tex-lscape.sty \
tex-ltxcmds.sty \
tex-marginnote.sty \
tex-morewrites.sty \
tex-mparhack.sty \
tex-multirow.sty \
tex-mweights.sty \
tex-nameref.sty \
tex-newunicodechar.sty \
tex-parskip.sty \
tex-path.sty \
tex-pdflscape.sty \
tex-pifont.sty \
tex-refcount.sty \
tex-rotating.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tcolorbox.sty \
tex-textcase.sty \
tex-tikz.sty \
tex-tocbibind.sty \
tex-tocvsec2.sty \
tex-translator.sty \
tex-varioref.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xpatch.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "BibTeX support for submitting to Economics journals"
DESCRIPTION = "The bundle offers macros and BibTeX styles for the American \
Economic Review (AER), the American Journal of Agricultural \
Economics (AJAE), the Canadian Journal of Economics (CJE), the \
European Review of Agricultural Economics (ERAE), the \
International Economic Review (IER) and Economica. The macro \
sets are based on (and require) the harvard package, and all \
provide variations of author-date styles of presentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32639"

RPM_NAME = "texlive-economic-2023.209.svn32639-54.1.noarch.rpm"
RPM_HASH = "98c24d9abbf1e7b3eaec0f59fa2577140a32ded4e84f7ef6a5c3fce64ecc3804265d972f744c18e9699413c6e0fff372838cf42ad92c7defce2dca4273911946"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aer.sty \
tex-aertt.sty \
tex-agecon.cls \
tex-ajae.cls \
tex-apecon.cls \
tex-cje.sty \
tex-ecca.cls \
tex-erae.cls \
tex-itaxpf.cls \
tex-jrurstud.cls \
tex-njf.cls \
tex-oegatb.cls \
tex-pocoec.cls \
tex-regstud.cls \
tex-worlddev.cls \
texlive-economic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-bm.sty \
tex-caption.sty \
tex-courier.sty \
tex-endfloat.sty \
tex-endnotes.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-ifthen.sty \
tex-lmodern.sty \
tex-mathptmx.sty \
tex-natbib.sty \
tex-scrartcl.cls \
tex-setspace.sty \
tex-soul.sty \
tex-stringstrings.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-ulem.sty \
tex-url.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

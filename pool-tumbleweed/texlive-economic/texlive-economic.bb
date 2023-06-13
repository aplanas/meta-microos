SUMMARY = "BibTeX support for submitting to Economics journals"
DESCRIPTION = "The bundle offers macros and BibTeX styles for the American \
Economic Review (AER), the American Journal of Agricultural \
Economics (AJAE), the Canadian Journal of Economics (CJE), the \
European Review of Agricultural Economics (ERAE), the \
International Economic Review (IER) and Economica. The macro \
sets are based on (and require) the harvard package, and all \
provide variations of author-date styles of presentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32639"

RPM_NAME = "texlive-economic-2023.201.svn32639-53.1.noarch.rpm"
RPM_HASH = "6b0456558041a0d6d1760beb6e22e5f24e6f1577eb68d34b2da82a88ed564b576b2b1dbf61766a2b447dcf10264f07e9c35879e4b543b898ce853fc9a1ea5787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(aer.sty) \
tex(aertt.sty) \
tex(agecon.cls) \
tex(ajae.cls) \
tex(apecon.cls) \
tex(cje.sty) \
tex(ecca.cls) \
tex(erae.cls) \
tex(itaxpf.cls) \
tex(jrurstud.cls) \
tex(njf.cls) \
tex(oegatb.cls) \
tex(pocoec.cls) \
tex(regstud.cls) \
tex(worlddev.cls) \
texlive-economic"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(babel.sty) \
tex(bm.sty) \
tex(caption.sty) \
tex(courier.sty) \
tex(endfloat.sty) \
tex(endnotes.sty) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(helvet.sty) \
tex(ifthen.sty) \
tex(lmodern.sty) \
tex(mathptmx.sty) \
tex(natbib.sty) \
tex(scrartcl.cls) \
tex(setspace.sty) \
tex(soul.sty) \
tex(stringstrings.sty) \
tex(textcomp.sty) \
tex(titlesec.sty) \
tex(ulem.sty) \
tex(url.sty) \
tex(verbatim.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

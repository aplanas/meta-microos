SUMMARY = "Japanese document class collection for all major engines"
DESCRIPTION = "This package provides an extended version of the Japanese \
document class collection provided by jsclasses. While the \
original version supports only pLaTeX and upLaTeX, the extended \
version also supports pdfLaTeX, XeLaTeX and LuaLaTeX, with the \
aid of suitable packages that provide capability of Japanese \
typesetting."
LICENSE = "BSD-3-Clause"

PV = "2023.201.2.7asvn63011"

RPM_NAME = "texlive-bxjscls-2023.201.2.7asvn63011-52.1.noarch.rpm"
RPM_HASH = "47f26378a26b21fc98c887f9045f73fc3f9a4161f9a2e90b818ccd44e429f2f9ac979503a5f7edec86ad69f8e1f1946b1438d0adf66916c78eef4a00ef1cb0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjsarticle.cls \
tex-bxjsbook.cls \
tex-bxjscjkcat.sty \
tex-bxjscompat.sty \
tex-bxjsja-minimal.def \
tex-bxjsja-modern.def \
tex-bxjsja-pandoc.def \
tex-bxjsja-standard.def \
tex-bxjspandoc.sty \
tex-bxjsreport.cls \
tex-bxjsslide.cls \
texlive-bxjscls"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bxcalc.sty \
tex-bxcjkjatype.sty \
tex-bxghost.sty \
tex-bxorigcapt.sty \
tex-bxwareki.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-filehook.sty \
tex-fixltx2e.sty \
tex-geometry.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-jslogo.sty \
tex-keyval.sty \
tex-luatexja-fontspec.sty \
tex-luatexja-preset.sty \
tex-luatexja.sty \
tex-pdftexcmds.sty \
tex-plautopatch.sty \
tex-polyglossia.sty \
tex-pxbabel.sty \
tex-pxchfon.sty \
tex-pxjahyper-enc.sty \
tex-t1enc.def \
tex-type1cm.sty \
tex-zxjafont.sty \
tex-zxjatype.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

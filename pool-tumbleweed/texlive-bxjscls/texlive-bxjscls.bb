SUMMARY = "Japanese document class collection for all major engines"
DESCRIPTION = "This package provides an extended version of the Japanese \
document class collection provided by jsclasses. While the \
original version supports only pLaTeX and upLaTeX, the extended \
version also supports pdfLaTeX, XeLaTeX and LuaLaTeX, with the \
aid of suitable packages that provide capability of Japanese \
typesetting."
LICENSE = "BSD-3-Clause"

PV = "2023.209.2.7asvn63011"

RPM_NAME = "texlive-bxjscls-2023.209.2.7asvn63011-53.1.noarch.rpm"
RPM_HASH = "7eb6cc5a7b1134c1252188ebebdf253c8e09036af858956ab683fa65096520134f656d90fbc464b0f7184f897f2d69f09060d5773d77d83b9b43b86ab61e2557"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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

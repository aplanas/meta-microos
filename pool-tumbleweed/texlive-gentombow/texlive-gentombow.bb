SUMMARY = "Generate Japanese-style crop marks"
DESCRIPTION = "This bundle provides a LaTeX package for generating \
Japanese-style crop marks (called 'tombow' in Japanese) for \
practical use in self-publishing. The bundle contains the \
following packages: gentombow.sty: Generate crop marks (called \
'tombow' in Japanese) for practical use in self-publishing. It \
provides the core 'tombow' feature if not available. \
pxgentombow.sty: Superseded by gentombow.sty; kept for \
compatibility only. bounddvi.sty: Set papersize special to DVI \
file. Can be used on LaTeX/pLaTeX/upLaTeX (with DVI output \
mode) with dvips or dvipdfmx drivers."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn64333"

RPM_NAME = "texlive-gentombow-2023.209.svn64333-53.1.noarch.rpm"
RPM_HASH = "f64474c86e5033878b988b34de650c83f6db309781d21f30955d9c1a29580c9e3cae0535f9d22206730b9484e2764a365fa429c8490db302fca29b615e833221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bounddvi.sty \
tex-gentombow.sty \
tex-pxesopic.sty \
tex-pxgentombow.sty \
tex-pxpdfpages.sty \
tex-pxtextpos.sty \
texlive-gentombow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-filehook.sty \
tex-pdfpages.sty \
tex-pxatbegshi.sty \
tex-pxeveryshi.sty \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

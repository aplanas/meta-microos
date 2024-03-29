SUMMARY = "High-level LaTeX3 concepts"
DESCRIPTION = "This collection contains implementations for aspects of the \
LaTeX3 kernel, dealing with higher-level ideas such as the \
Designer Interface. The packages here are considered broadly \
stable (The LaTeX3 Project does not expect the interfaces to \
alter radically). These packages are built on LaTeX2e \
conventions at the interface level, and so may not migrate in \
the current form to a stand-alone LaTeX3 format. Packages \
provided: xparse, which provides a high-level interface for \
declaring document commands xfp, an expandable IEEE 754 FPU for \
LaTeX l3keys2e, which makes the facilities of the kernel module \
l3keys available for use by LaTeX 2e packages xtemplate, which \
provides a means of defining generic functions using a \
key-value syntax xfrac, which provides flexible split-level \
fractions"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65722"

RPM_NAME = "texlive-l3packages-2023.209.svn65722-56.1.noarch.rpm"
RPM_HASH = "d89c5d8b319063eed6202a59024386bce877856a75cbd87747b03a1aae73b0df74f1a2f1cff8853bdd9965990ec42998e5696cf46858e98395506cbfbf673ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-l3keys2e.sty \
tex-xfp.sty \
tex-xfrac.sty \
tex-xparse-2018-04-12.sty \
tex-xparse-2020-10-01.sty \
tex-xparse-generic.tex \
tex-xparse.sty \
tex-xtemplate.sty \
texlive-l3packages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

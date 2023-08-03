SUMMARY = "LaTeX laboratory: Development pre-release"
DESCRIPTION = "This package provides a testing release for upcoming changes to \
the latex-lab bundle, which provides a route for additions to \
the LaTeX kernel to be stablised. It accompanies the \
pre-testing kernel code (latex-base-dev), and is intended for \
testing by knowledgeable users."
LICENSE = "LPPL-1.0"

PV = "2023.209.20230601_pre_release_2svn66513"

RPM_NAME = "texlive-latex-lab-dev-2023.209.20230601_pre_release_2svn66513-56.1.noarch.rpm"
RPM_HASH = "71fdcba6015b5a5dc65ad0b5b266b058231abb1133a3a5fb8be461798c2a534ea9868a28e4321cfd9d6503aa139ee3322f93bbd5e30c074957960aaffe63f8bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-glyphtounicode-cmex.tex \
texdev-latex-lab-kernel-changes.sty \
texdev-latex-lab-testphase-block-tagging.sty \
texdev-latex-lab-testphase-math.sty \
texdev-latex-lab-testphase-new-or-1.sty \
texdev-latex-lab-testphase-new-or-2.sty \
texdev-latex-lab-testphase-sec-tagging.sty \
texdev-latex-lab-testphase-toc-tagging.sty \
texlive-latex-lab-dev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

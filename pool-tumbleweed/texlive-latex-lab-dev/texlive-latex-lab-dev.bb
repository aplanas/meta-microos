SUMMARY = "LaTeX laboratory: Development pre-release"
DESCRIPTION = "This package provides a testing release for upcoming changes to \
the latex-lab bundle, which provides a route for additions to \
the LaTeX kernel to be stablised. It accompanies the \
pre-testing kernel code (latex-base-dev), and is intended for \
testing by knowledgeable users."
LICENSE = "LPPL-1.0"

PV = "2023.201.20230601_pre_release_2svn66513"

RPM_NAME = "texlive-latex-lab-dev-2023.201.20230601_pre_release_2svn66513-55.1.noarch.rpm"
RPM_HASH = "8b428913975c693dd28c3f07e3b5f0152f9d305984be03c47a27128a33d5ed9bbeaecb9b73ec56852bb1bd276afa53300ccfb6e50c179b2fe02b2af4004ef36c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev(glyphtounicode-cmex.tex) \
texdev(latex-lab-kernel-changes.sty) \
texdev(latex-lab-testphase-block-tagging.sty) \
texdev(latex-lab-testphase-math.sty) \
texdev(latex-lab-testphase-new-or-1.sty) \
texdev(latex-lab-testphase-new-or-2.sty) \
texdev(latex-lab-testphase-sec-tagging.sty) \
texdev(latex-lab-testphase-toc-tagging.sty) \
texlive-latex-lab-dev"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(xtemplate.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

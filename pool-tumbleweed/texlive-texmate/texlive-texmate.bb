SUMMARY = "Comprehensive chess annotation in LaTeX"
DESCRIPTION = "TeXmate formats chess games from very simple ascii input. The \
clean '1. e4 e5; 2. Nf3 Nc6; 3. Bb5 a6' will produce the same \
results as the sloppier '1 e4 e5; Nf3 Nc6 3.. Bb5 a6'. The \
resulting format is fully customizable. There are 4 levels of \
commentary: 1 is the main game, 2-3 are commentaries. Each has \
its fonts, punctuation marks, etc., and these are also \
customizable. The package includes a tool for the creation of \
diagrams. The package works in conjunction with skak to produce \
diagrams of the current position automatically. For chess \
fonts, the package uses the chessfss system."
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn15878"

RPM_NAME = "texlive-texmate-2023.209.2svn15878-55.1.noarch.rpm"
RPM_HASH = "9ec1cce6697b8c7f53ae0d113da022de86bd92873bcbaf5bdfa5596d5a33585b7bc091883b688f087e4413d6e73d2f1643320037c063c380caaf8302040494e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texmate.sty \
texlive-texmate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-chessfss.sty \
tex-skak.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

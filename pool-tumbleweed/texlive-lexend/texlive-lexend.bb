SUMMARY = "The Lexend fonts for XeLaTeX and LuaLaTeX through fontspec"
DESCRIPTION = "The purpose of this package is pretty straightforward: The \
Lexend font collection has been designed by Dr. Bonnie \
Shaver-Troup and Thomas Jockin to make reading easier for \
everyone. Now my goal is to bring this wonderful collection to \
the world of LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0.70svn57564"

RPM_NAME = "texlive-lexend-2023.201.1.1.0.70svn57564-54.1.noarch.rpm"
RPM_HASH = "9e21ac7a0755af27991facede4f29a4763f4587f4f604025abcf066376929c61ffce4f901fbdf5f0ec688c4702446adce7386b8e7c4a083cf204e69a18aeb786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lexend.sty) \
texlive-lexend"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(fontspec.sty) \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lexend-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

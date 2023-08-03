SUMMARY = "Plotting dart boards"
DESCRIPTION = "pst-dart is a PSTricks related package and draws Dart Boards. \
Optional arguments are the unit and the fontsize."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn60476"

RPM_NAME = "texlive-pst-dart-2023.209.0.0.03svn60476-53.1.noarch.rpm"
RPM_HASH = "bf1718cc0bc870fba64bbdfd6dfecd36fdf54f5f2ab00eb64fdf70e21abea5f2575a3f518c3f851bee551782be6227e0471432a9c8b036ca7f63d52d8d724fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-dart.sty \
tex-pst-dart.tex \
texlive-pst-dart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

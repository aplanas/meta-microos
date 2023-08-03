SUMMARY = "A LaTeX document style to produce homework, quiz and exam papers"
DESCRIPTION = "The package provides commands and environments that simplify \
and streamline the process of preparing homework, quiz and exam \
papers according to apreffered style. The default style is \
based on the guidelines set by the department of mathematics at \
King Fahd University of Petroleum and Minerals (KFUPM). It can \
be easily customized to fit any style for any institution."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn63977"

RPM_NAME = "texlive-kfupm-math-exam-2023.209.0.0.1.0svn63977-56.1.noarch.rpm"
RPM_HASH = "61aeac2187c8c5f77fba7adb0212100b4cbe7c5ce083b9097c9b6bdb51458ad3c13f31c5ff4b2ec3aa82eadae7f5f3ab3ad07be19fc7bf2e7519fe84e2f930a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kfupm-math-exam.cls \
texlive-kfupm-math-exam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-article.cls \
tex-booktabs.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-mathrsfs.sty \
tex-pgfplots.sty \
tex-tcolorbox.sty \
tex-trimspaces.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

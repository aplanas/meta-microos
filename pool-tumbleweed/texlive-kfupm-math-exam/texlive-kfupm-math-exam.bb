SUMMARY = "A LaTeX document style to produce homework, quiz and exam papers"
DESCRIPTION = "The package provides commands and environments that simplify \
and streamline the process of preparing homework, quiz and exam \
papers according to apreffered style. The default style is \
based on the guidelines set by the department of mathematics at \
King Fahd University of Petroleum and Minerals (KFUPM). It can \
be easily customized to fit any style for any institution."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn63977"

RPM_NAME = "texlive-kfupm-math-exam-2023.201.0.0.1.0svn63977-55.1.noarch.rpm"
RPM_HASH = "39dde18f923ef72340fb5e37eb9c03517bd4844c3455416eca285aa6364b62ef3e99426d393c3ac817953921076f44cf090a08708f60639306bfbfcde427ed0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kfupm-math-exam.cls \
texlive-kfupm-math-exam"

RDEPENDS:${PN} += "/bin/sh \
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

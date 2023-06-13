SUMMARY = "Coloured boxes, for LaTeX examples and theorems, etcetera"
DESCRIPTION = "This package provides an environment for coloured and framed \
text boxes with a heading line. Optionally, such a box may be \
split in an upper and a lower part; thus the package may be \
used for the setting of LaTeX examples where one part of the \
box displays the source code and the other part shows the \
output. Another common use case is the setting of theorems. The \
package supports saving and reuse of source code and text \
parts. The package depends on the pgf, verbatim, environ, and \
etoolbox packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0.1svn65800"

RPM_NAME = "texlive-tcolorbox-2023.201.6.0.1svn65800-54.1.noarch.rpm"
RPM_HASH = "7a95b5fed2896206b28b9d6165cb2616255a858826550d6687b0d55acf1acc21dba234b113243fe56eed88d4add906fd128160212523e5dc1d85bae3bf6c1bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tcbbreakable.code.tex) \
tex(tcbdocumentation.code.tex) \
tex(tcbexternal.code.tex) \
tex(tcbfitting.code.tex) \
tex(tcbhooks.code.tex) \
tex(tcblistings.code.tex) \
tex(tcblistingscore.code.tex) \
tex(tcblistingsutf8.code.tex) \
tex(tcbmagazine.code.tex) \
tex(tcbminted.code.tex) \
tex(tcbposter.code.tex) \
tex(tcbprocessing.code.tex) \
tex(tcbraster.code.tex) \
tex(tcbskins.code.tex) \
tex(tcbskinsjigsaw.code.tex) \
tex(tcbtheorems.code.tex) \
tex(tcbvignette.code.tex) \
tex(tcbxparse.code.tex) \
tex(tcolorbox.sty) \
texlive-tcolorbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(pgf.sty) \
tex(verbatim.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

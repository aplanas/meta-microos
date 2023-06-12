SUMMARY = "Include TeX files as graphics (.tex support for \\includegraphics)"
DESCRIPTION = "The package builds on the standard LaTeX packages graphics \
and/or graphicx and allows external LaTeX source files to be \
included, in the same way as graphic files, by \
\\includegraphics. In effect, then package adds support for the \
.tex extension. Some of the lower level operations like \
clipping and trimming are implemented using the adjustbox \
package which includes native pdfLaTeX support and uses the pgf \
package for other output formats."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn64967"

RPM_NAME = "texlive-gincltex-2023.201.0.0.3svn64967-52.1.noarch.rpm"
RPM_HASH = "a0b57444d9302b2fade75c16d9ff72772fc887661be023075ab2479db42c8f21f4432b2ab42561bf28e2a6a0d7d5b0466d3518e88d7667a4bc42991e1013f4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gincltex.sty) \
texlive-gincltex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(adjustbox.sty) \
tex(svn-prov.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

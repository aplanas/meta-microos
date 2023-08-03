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

PV = "2023.209.0.0.3svn64967"

RPM_NAME = "texlive-gincltex-2023.209.0.0.3svn64967-53.1.noarch.rpm"
RPM_HASH = "ff7b0587f353272a35be24b18cbdde8123728f3fc759a12d30ffdc381c0fbd6ecd7ca7dda7005662bfc285aed909c930cc824afbdc2235df7419d0edf3126a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gincltex.sty \
texlive-gincltex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-svn-prov.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

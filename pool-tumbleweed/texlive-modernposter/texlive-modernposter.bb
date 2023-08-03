SUMMARY = "A modern LaTeX poster theme"
DESCRIPTION = "This class extends the a0poster class in that it adds support \
to easily create posters without the need for taking care of \
the layout at all. It allows to use \\maketitle to generate a \
fancy header containing the title information and also provides \
macros to position various different types of text boxes in a \
two-column layout. The color scheme is inspired by the \
metropolis beamer theme."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03.1svn47269"

RPM_NAME = "texlive-modernposter-2023.209.1.03.1svn47269-55.1.noarch.rpm"
RPM_HASH = "d5bdb1f3a52a8faea8841fd242f79777be53e8e20577e6da8f2c33d1aed23e0560e4453d3b9053b3084902b5efe7d7bcc64468bb539ba5846aa423993402d07a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modernposter.cls \
texlive-modernposter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraSans.sty \
tex-a0poster.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fontawesome.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-relsize.sty \
tex-sfmath.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "A modern LaTeX poster theme"
DESCRIPTION = "This class extends the a0poster class in that it adds support \
to easily create posters without the need for taking care of \
the layout at all. It allows to use \\maketitle to generate a \
fancy header containing the title information and also provides \
macros to position various different types of text boxes in a \
two-column layout. The color scheme is inspired by the \
metropolis beamer theme."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03.1svn47269"

RPM_NAME = "texlive-modernposter-2023.201.1.03.1svn47269-54.1.noarch.rpm"
RPM_HASH = "98e77e41fc6e74c16029744402f7aa09e5855067df762676f4637fa3cdc35e48c45358c54d83f70134d91cdd76ba0c81d82c70ee569867bea7fa383a77e2bf9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(modernposter.cls) \
texlive-modernposter"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(FiraSans.sty) \
tex(a0poster.cls) \
tex(enumitem.sty) \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(fontawesome.sty) \
tex(helvet.sty) \
tex(hyperref.sty) \
tex(pgfkeys.sty) \
tex(pgfopts.sty) \
tex(relsize.sty) \
tex(sfmath.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

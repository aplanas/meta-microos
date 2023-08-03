SUMMARY = "Typeset source code listings using LaTeX"
DESCRIPTION = "The package enables the user to typeset programs (programming \
code) within LaTeX; the source code is read directly by TeX--no \
front-end processor is needed. Keywords, comments and strings \
can be typeset using different styles (default is bold for \
keywords, italic for comments and no special style for \
strings). Support for hyperref is provided. To use, \
\\usepackage{listings}, identify the language of the object to \
typeset, using a construct like: \\lstset{language=Python}, then \
use environment lstlisting for inline code. External files may \
be formatted using \\lstinputlisting to process a given file in \
the form appropriate for the current language. Short (in-line) \
listings are also available, using either \\lstinline|...| or \
|...| (after defining the | token with the \\lstMakeShortInline \
command)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn66222"

RPM_NAME = "texlive-listings-2023.209.1.9svn66222-55.1.noarch.rpm"
RPM_HASH = "4ecfe9a03747f37d9c29729c77e3bb14a6e7db10db574b046e43c395d92a2f432421d7c78a419212cb690d9db221ea76d43aa14015cf37aeb4cf79eb4d63bcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listings.cfg \
tex-listings.sty \
tex-lstdoc.sty \
tex-lstlang1.sty \
tex-lstlang2.sty \
tex-lstlang3.sty \
tex-lstmisc.sty \
texlive-listings"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithmic.sty \
tex-color.sty \
tex-fancyvrb.sty \
tex-hyperref.sty \
tex-keyval.sty \
tex-nameref.sty \
tex-textcomp.sty \
tex-upquote.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

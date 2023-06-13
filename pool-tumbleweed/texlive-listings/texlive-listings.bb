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

PV = "2023.201.1.9svn66222"

RPM_NAME = "texlive-listings-2023.201.1.9svn66222-54.1.noarch.rpm"
RPM_HASH = "a094eeb4a2e2bb4d51b553f8670e25283626eca875b914f2812398f8725291eb6a12f5d1ebee1894f03641a85df46a0034e2ac2b2226017b8651221a8edd7555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(listings.cfg) \
tex(listings.sty) \
tex(lstdoc.sty) \
tex(lstlang1.sty) \
tex(lstlang2.sty) \
tex(lstlang3.sty) \
tex(lstmisc.sty) \
texlive-listings"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(algorithmic.sty) \
tex(color.sty) \
tex(fancyvrb.sty) \
tex(hyperref.sty) \
tex(keyval.sty) \
tex(nameref.sty) \
tex(textcomp.sty) \
tex(upquote.sty) \
tex(url.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

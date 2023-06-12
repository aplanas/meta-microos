SUMMARY = "Macros for setting numbered entries in shuffled order"
DESCRIPTION = "This package provides macros and environments to allow the user \
to typeset a series of cross-referenced, numbered 'entries', \
shuffled into random order, to produce an interactive novel or \
'gamebook'. This allows entries to be written in natural order \
and shuffled automatically into a repeatable non-linear order. \
Limited support is provided for footnotes to appear at the \
natural position: the end of each entry, or the end of each \
page, whichever is closest to the footnote mark. This is \
unrelated to the gamebook package which is more concerned with \
the formatting of entries rather than their order. The two \
packages can be used together or separately."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn63424"

RPM_NAME = "texlive-gamebooklib-2023.201.1.3svn63424-52.1.noarch.rpm"
RPM_HASH = "293f711b92bace527d7b55debc257355014a8a71ee5dceb65bf49ce39d4053f4b66c3c80a68e1ede46e7866b52934708a7723bbf5ca84f2ba9b51511687ac5e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gamebooklib.sty) \
texlive-gamebooklib"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(environ.sty) \
tex(ifthen.sty) \
tex(lcg.sty) \
tex(macroswap.sty) \
tex(silence.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

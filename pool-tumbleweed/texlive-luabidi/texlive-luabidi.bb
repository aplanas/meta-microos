SUMMARY = "Bidi functions for LuaTeX"
DESCRIPTION = "The package attempts to emulate the XeTeX bidi package, in the \
context of LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn54512"

RPM_NAME = "texlive-luabidi-2023.201.0.0.5svn54512-52.1.noarch.rpm"
RPM_HASH = "c27042ac23eb81743676d367c8bf38a45f1a03b3c00e227ff84a695a48c357be984c8cf450346d58adab6fdd3259f60ddb603a75022287108ccbdb3072282b70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luabidi-arabmaths.def \
tex-luabidi-autofootnoterule.def \
tex-luabidi-footnotes.def \
tex-luabidi-test-arabmaths.tex \
tex-luabidi.sty \
texlive-luabidi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

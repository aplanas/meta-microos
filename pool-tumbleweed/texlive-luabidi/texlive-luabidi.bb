SUMMARY = "Bidi functions for LuaTeX"
DESCRIPTION = "The package attempts to emulate the XeTeX bidi package, in the \
context of LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.5svn54512"

RPM_NAME = "texlive-luabidi-2023.208.0.0.5svn54512-53.1.noarch.rpm"
RPM_HASH = "bd0691878fb5d9229147262faec8c1f2f0ad70f6ea9b0a0cb452e2bfe01bf98c30355abbab85a09d59bc86520446376cf0da16fc8a2363b6b8e94c69b1ab9d50"
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

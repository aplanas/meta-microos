SUMMARY = "Basic resource management for LuaTeX code"
DESCRIPTION = "The LaTeX kernel (LaTeX2e 2015/10/01 onward) builds in support \
for LuaTeX functionality, also available as ltluatex.tex for \
users of plain TeX and those with older LaTeX kernel \
implementations. This support is based on ideas taken from the \
original luatexbase package, but there are interface \
differences. This 'stub' package provides a compatibility layer \
to allow existing packages to upgrade smoothly to the new \
support structure."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn52663"

RPM_NAME = "texlive-luatexbase-2023.201.1.3svn52663-52.1.noarch.rpm"
RPM_HASH = "1a7fb1ba7c8185e1fdde4f48ddb451220bd7c5a414f2ac656c61dba15d42530f6f9bfa77fd56bc53fce316e268525bc5394bbaff7b46ea6402884ee02d97cf5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luatexbase-attr.sty) \
tex(luatexbase-cctb.sty) \
tex(luatexbase-compat.sty) \
tex(luatexbase-loader.sty) \
tex(luatexbase-mcb.sty) \
tex(luatexbase-modutils.sty) \
tex(luatexbase-regs.sty) \
tex(luatexbase.sty) \
texlive-luatexbase"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ctablestack.sty) \
texlive \
texlive-ctablestack \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

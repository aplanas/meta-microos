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

PV = "2023.208.1.3svn52663"

RPM_NAME = "texlive-luatexbase-2023.208.1.3svn52663-53.1.noarch.rpm"
RPM_HASH = "63af827de34bde1b0010c71f6fad81ea14c7bc9f41cf97a8c6bd2a740a6fb2f3edb76bd95a0ae968d796edf270f526a78c6e1d4f0d5daf544d3f7f0c92184d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatexbase-attr.sty \
tex-luatexbase-cctb.sty \
tex-luatexbase-compat.sty \
tex-luatexbase-loader.sty \
tex-luatexbase-mcb.sty \
tex-luatexbase-modutils.sty \
tex-luatexbase-regs.sty \
tex-luatexbase.sty \
texlive-luatexbase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ctablestack.sty \
texlive \
texlive-ctablestack \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

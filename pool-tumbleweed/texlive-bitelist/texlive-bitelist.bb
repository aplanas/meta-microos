SUMMARY = "Split list, in TeX's mouth"
DESCRIPTION = "The package provides commands for 'splitting' a token list at \
the first occurrence of another (specified) token list. I.e., \
for given token lists s, t return b and the shortest a, such \
that t = a s b. The package's mechanism differs from those of \
packages providing similar features, in the following ways: the \
method uses TeX's mechanism of reading delimited macro \
parameters; splitting macros work by pure expansion, without \
assignments; the operation is carried out in a single macro \
call. A variant of the operation is provided, that retains \
outer braces."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn25779"

RPM_NAME = "texlive-bitelist-2023.209.0.0.1svn25779-53.1.noarch.rpm"
RPM_HASH = "761368b9c245de7c769f3e9a187dd820ae58c8bf4ec479b115417d2f88ec8e583c78877f6c8182359cb199adf0a0c73003aa9568228c77e2f099500d9a062ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bitedemo.tex \
tex-bitelist.sty \
texlive-bitelist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

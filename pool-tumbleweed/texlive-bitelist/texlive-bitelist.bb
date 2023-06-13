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

PV = "2023.201.0.0.1svn25779"

RPM_NAME = "texlive-bitelist-2023.201.0.0.1svn25779-52.1.noarch.rpm"
RPM_HASH = "a19e4ca50cb227bc67812490fc2162fb30bfc0103f60a75a082a1a7d439aa189e8e98ba32e955a8e6bbbf6959a1b9264365a2e4e392ac588f96d82e8131214ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bitedemo.tex) \
tex(bitelist.sty) \
texlive-bitelist"

RDEPENDS:${PN} += "/bin/sh \
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

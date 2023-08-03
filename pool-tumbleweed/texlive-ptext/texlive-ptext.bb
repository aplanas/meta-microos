SUMMARY = "A 'lipsum' for Persian"
DESCRIPTION = "The package provides lipsum-like facilities for the Persian \
language. The source of the filling text is the Persian epic \
'the Shanameh' (100 paragraphs are used.) The package needs to \
be run under XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn30171"

RPM_NAME = "texlive-ptext-2023.209.1.1svn30171-54.1.noarch.rpm"
RPM_HASH = "3af1cd9ad84e75f331a28cd8b32661f404469e41d671887efdf6294e58a00b470fce726ec9e64ef0235ce412c98efa4ed7a6e5036ea94f0038fc9c07214ba567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ptext.sty \
texlive-ptext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

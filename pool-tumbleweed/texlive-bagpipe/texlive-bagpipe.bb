SUMMARY = "Support for typesetting bagpipe music"
DESCRIPTION = "Typesetting bagpipe music in MusixTeX is needlessly tedious. \
This package provides specialized and re-defined macros to \
simplify this task."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.02svn34393"

RPM_NAME = "texlive-bagpipe-2023.209.3.02svn34393-54.1.noarch.rpm"
RPM_HASH = "86fa89033884dc29700267256b0f7f8f9e2ad08d7843f32b82c5cf5a776240906186aea35db53796dfd5890599af0c81f54dddba90c25df8a55eb91203113d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bagpipe.tex \
texlive-bagpipe"

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

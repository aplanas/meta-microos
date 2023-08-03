SUMMARY = "TeX definitions with named parameters"
DESCRIPTION = "This package provides a prefix \\named to be used in TeX \
definitions so that parameters can be identified by their name \
rather than by number, giving parameters a semantic rather than \
syntactic meaning, making it easy to understand long \
definitions. A usual definition reads: \\def\\SayHello#1{Hello, \
 \
\\named\\def\\SayHello#[person]{Hello, #[person]!} and \\named will \
figure out the numbering of the parameters for you."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55881"

RPM_NAME = "texlive-namedef-2023.209.1.0svn55881-55.1.noarch.rpm"
RPM_HASH = "fdea30c84706644c6c70a13e77171843448da6db60fa6dd8a70f3c7165fcc462d5d31e63b9780dd9d807e26f8850832eed7bf89b5d083fba8e4b42a4969e298a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-namedef.sty \
texlive-namedef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3-generic.tex \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

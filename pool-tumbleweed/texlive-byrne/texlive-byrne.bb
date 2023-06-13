SUMMARY = "This package provides a set of tools to typeset geometric proofs in the style of Oliver Byrne's 1847 ed. of Euclid's 'Elements'"
DESCRIPTION = "This package is a LaTeX adaptation of a set of tools developed \
for ConTeXt reproduction of Oliver Byrne's 1847 edition of the \
first six books of Euclid's 'Elements'; \
(https://github.com/jemmybutton/byrne-euclid). It consists of a \
MetaPost library, responsible for all the drawing and a set of \
LaTeX macros to conveniently use them. This package works with \
LuaLaTeX and relies on luamplib v2.23.0 or higher."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2.2svn61943"

RPM_NAME = "texlive-byrne-2023.201.0.0.2.2svn61943-52.1.noarch.rpm"
RPM_HASH = "2c605d0bd58af608bcab0eb85b1ad48ca699f0cbb748237f99b4915b12228fa82a581199b904fafa88acab7e1ab9602f8d3ce69f1c3cf7c610834302d13a256c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(byrne.sty) \
texlive-byrne"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifmtarg.sty) \
tex(luamplib.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

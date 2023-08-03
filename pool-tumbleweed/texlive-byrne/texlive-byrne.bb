SUMMARY = "This package provides a set of tools to typeset geometric proofs in the style of Oliver Byrne's 1847 ed. of Euclid's 'Elements'"
DESCRIPTION = "This package is a LaTeX adaptation of a set of tools developed \
for ConTeXt reproduction of Oliver Byrne's 1847 edition of the \
first six books of Euclid's 'Elements'; \
(https://github.com/jemmybutton/byrne-euclid). It consists of a \
MetaPost library, responsible for all the drawing and a set of \
LaTeX macros to conveniently use them. This package works with \
LuaLaTeX and relies on luamplib v2.23.0 or higher."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2.2svn61943"

RPM_NAME = "texlive-byrne-2023.209.0.0.2.2svn61943-53.1.noarch.rpm"
RPM_HASH = "bda9628eb821a6f7817f8af77bd3eef763fdb470d69134607401f98b9d43d089c45dbdd2625d5580666a980731abd3bd2c3ae779e7bea5a987c75fed3c81554d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-byrne.sty \
texlive-byrne"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifmtarg.sty \
tex-luamplib.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

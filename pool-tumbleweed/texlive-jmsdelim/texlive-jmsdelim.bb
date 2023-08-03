SUMMARY = "A package for compositional delimiter sizing"
DESCRIPTION = "Correctly sizing delimiters is very difficult, particularly in \
well-architected documents: a correctly engineered mathematical \
document will include macros for all operations, and these \
macros necessarily will include delimiters (such as \
parentheses). However, the correct size for the delimiter \
cannot be chosen ahead of time, because it will depend on the \
arguments; two options are available: Provide optional \
arguments to each notation macro for choosing delimiter sizes. \
This is nearly intractable to do in practice. Ignore delimiter \
sizes. With jmsdelim we offer an alternative: the correct \
delimiter sizes can be set at the leaf nodes of a mathematical \
expression, and magically bubble upward through the delimiters."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn62630"

RPM_NAME = "texlive-jmsdelim-2023.209.0.0.2.0svn62630-56.1.noarch.rpm"
RPM_HASH = "7401b5361c5fb9c9315d519ec13476fd139875aac2b824383969a814a7010450c294210c6a56f012c60720ce9f5596268ebf4b15cd1f309f064eaa8f306fb0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jmsdelim.sty \
texlive-jmsdelim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ifluatex.sty \
tex-l3keys2e.sty \
tex-scalerel.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

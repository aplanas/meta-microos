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

PV = "2023.201.0.0.2.0svn62630"

RPM_NAME = "texlive-jmsdelim-2023.201.0.0.2.0svn62630-55.1.noarch.rpm"
RPM_HASH = "16adbcc9176d0b3f8a0bdbec4b6e90b8c435b438433a5f4ab1fead5a501cc726a8437d4ce827e14bbf15d340220c8c2381abc7a1078b0fba66c7ee0238104a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jmsdelim.sty \
texlive-jmsdelim"

RDEPENDS:${PN} += "/bin/sh \
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

SUMMARY = "Natural mathematics notation"
DESCRIPTION = "Nath is a LaTeX (both 2e and 2.09) style to separate \
presentation and content in mathematical typography. The style \
delivers a particular context-dependent presentation on the \
basis of a rather coarse context-independent notation. \
Highlighted features: depending on the context, the command \
\\frac produces either built-up or case or solidus fractions, \
with parentheses added whenever required for preservation of \
the mathematical meaning; delimiters adapt their size to the \
material enclosed, rendering \\left and \\right almost obsolete."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-nath-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "6c60b76c976f76d30671023429b335bd4418395cad416a91979140914e56c3aef0f204173f3ed53950b242bb9b0c6acae27c8562269930bb3dc77232e4e51e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nath.sty) \
texlive-nath"
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

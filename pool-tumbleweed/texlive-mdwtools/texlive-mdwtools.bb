SUMMARY = "Miscellaneous tools by Mark Wooding"
DESCRIPTION = "This collection of tools includes: support for short commands \
starting with @, macros to sanitise the OT1 encoding of the \
cmtt fonts; a 'do after' command; improved footnote support; \
mathenv for various alignment in maths; list handling; mdwmath \
which adds some minor changes to LaTeX maths; a rewrite of \
LaTeX's tabular and array environments; verbatim handling; and \
syntax diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.05.4svn15878"

RPM_NAME = "texlive-mdwtools-2023.201.1.05.4svn15878-52.1.noarch.rpm"
RPM_HASH = "e6d5691e6b7370643885a69500f108345f910e76c067a863d4becfdafa02774459022d03e42c9084c8eb54995676154a2d296271b5e9d4af2d61254f6cf60096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(at.sty) \
tex(cmtt.sty) \
tex(doafter.sty) \
tex(footnote.sty) \
tex(mTTcmtt.fd) \
tex(mTTenc.def) \
tex(mathenv.sty) \
tex(mdwlist.sty) \
tex(mdwmath.sty) \
tex(mdwtab.sty) \
tex(sverb.sty) \
tex(syntax.sty) \
texlive-mdwtools"
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

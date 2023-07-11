SUMMARY = "Miscellaneous tools by Mark Wooding"
DESCRIPTION = "This collection of tools includes: support for short commands \
starting with @, macros to sanitise the OT1 encoding of the \
cmtt fonts; a 'do after' command; improved footnote support; \
mathenv for various alignment in maths; list handling; mdwmath \
which adds some minor changes to LaTeX maths; a rewrite of \
LaTeX's tabular and array environments; verbatim handling; and \
syntax diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.05.4svn15878"

RPM_NAME = "texlive-mdwtools-2023.208.1.05.4svn15878-53.1.noarch.rpm"
RPM_HASH = "dc1b662ccb149fbc9f303b5a08071b742d1cac2cbd388de8bac1d557b06bd1793608d1a23f6f4362f27b16898cff8daa986c6f3311d1dc8104a0af5fdf3ad3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-at.sty \
tex-cmtt.sty \
tex-doafter.sty \
tex-footnote.sty \
tex-mTTcmtt.fd \
tex-mTTenc.def \
tex-mathenv.sty \
tex-mdwlist.sty \
tex-mdwmath.sty \
tex-mdwtab.sty \
tex-sverb.sty \
tex-syntax.sty \
texlive-mdwtools"

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

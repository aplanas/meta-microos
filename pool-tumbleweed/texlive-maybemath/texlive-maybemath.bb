SUMMARY = "Make math bold or italic according to context"
DESCRIPTION = "The \\maybebm and \\maybeit macros can be used in maths \
expressions to make the arguments typeset as bold or italic \
respectively if the surrounding context is appropriate. They \
are useful for writing user macros for use in general contexts. \
\\maybebm is especially appropriate when section titles contain \
math expressions, since the title will appear bold but the \
header and table of contents usually replicate the title in \
normal width. It uses the bm package to make things bold \
\\maybeit performs a similar role to \\mathrm{} but the maths \
expression will be italicised if the surrounding text is. \
\\maybeitsubscript is provided to shift subscripts to the left \
if the expression is italicised."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-maybemath-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "19418ff0a9c535af7ec834417c38b0c9ae0286de8b186b97f394eb74ab835a8fa70d57b893be5f19521d64f7b952f8884728637ad21a06fab4487d67d6333c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-maybemath.sty \
texlive-maybemath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-bm.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

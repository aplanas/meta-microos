SUMMARY = "Patch \\marginpar to avoid overfull margins"
DESCRIPTION = "Authors using LaTeX to typeset books with significant margin \
material often run into the problem of long notes running off \
the bottom of the page. A typical workaround is to insert \
\\vshift commands by hand, but this is a tedious process that is \
invalidated when pagination changes. Another workaround is \
memoir's \\sidebar function, but this can be unsatisfying for \
short textual notes, and standard marginpars cannot be mixed \
with sidebars. This package implements a solution to make \
marginpars 'just work' by keeping a list of floating inserts \
and arranging them intelligently in the output routine."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn55064"

RPM_NAME = "texlive-marginfix-2023.208.1.2svn55064-53.1.noarch.rpm"
RPM_HASH = "62c461847a7cbfba26f47f8ee1e55fd288e54268eebbe959a10cb7a751c69517b5e0289b3858f1c7bf23449990d4acea6842288ef8179caafde7bf5235103e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marginfix.sty \
texlive-marginfix"

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

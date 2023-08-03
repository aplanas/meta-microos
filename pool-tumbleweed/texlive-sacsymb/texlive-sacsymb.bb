SUMMARY = "'Sacred Symbols' prepared with TikZ"
DESCRIPTION = "The author tells us: This is 'a package with symbols prepared \
with TikZ. These symbols are the variables used in the space of \
the collapse of the wave function of a quantum field associated \
with the micro-tubule while exploring an Orchestrated, \
objective reduction (Orch OR) theory of consciousness as \
applied to the three brains model of psychological experience.'"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65768"

RPM_NAME = "texlive-sacsymb-2023.209.svn65768-54.1.noarch.rpm"
RPM_HASH = "269a01fb19bd1f655612f5041a48b051053ae2885ff9bb4546a72236b8a6ecc96cecebdec1dd5034ff2b2fbb56228afacae0a8f89360e7d5364b8c162311f4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sacsymb.sty \
texlive-sacsymb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

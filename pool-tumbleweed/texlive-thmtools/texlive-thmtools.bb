SUMMARY = "Extensions to theorem environments"
DESCRIPTION = "The bundle provides several packages for commonly-needed \
support for typesetting theorems. The packages should work with \
kernel theorems (theorems 'out of the box' with LaTeX), and the \
theorem and amsthm packages. Features of the bundle include: a \
key-value interface to \\newtheorem; a \\listoftheorems command; \
hyperref and autoref compatibility; a mechanism for restating \
entire theorems in a single macro call."
LICENSE = "LPPL-1.0"

PV = "2023.209.75svn65863"

RPM_NAME = "texlive-thmtools-2023.209.75svn65863-55.1.noarch.rpm"
RPM_HASH = "bb1dd988f903d453460f2378b39e78a10c57c89e15e0bc34afa24ca9aa54215a8faf4c9c1bc78cd9c1c4f8e9b350fd021dbf29c6618464350e6936486245ea6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aliasctr.sty \
tex-parseargs.sty \
tex-thm-amsthm.sty \
tex-thm-autoref.sty \
tex-thm-beamer.sty \
tex-thm-kv.sty \
tex-thm-listof.sty \
tex-thm-llncs.sty \
tex-thm-ntheorem.sty \
tex-thm-patch.sty \
tex-thm-restate.sty \
tex-thmdef-mdframed.sty \
tex-thmdef-shaded.sty \
tex-thmdef-thmbox.sty \
tex-thmtools.sty \
tex-unique.sty \
texlive-thmtools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-keyval.sty \
tex-kvsetkeys.sty \
tex-mdframed.sty \
tex-remreset.sty \
tex-shadethm.sty \
tex-thmbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

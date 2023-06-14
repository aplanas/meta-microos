SUMMARY = "Extensions to theorem environments"
DESCRIPTION = "The bundle provides several packages for commonly-needed \
support for typesetting theorems. The packages should work with \
kernel theorems (theorems 'out of the box' with LaTeX), and the \
theorem and amsthm packages. Features of the bundle include: a \
key-value interface to \\newtheorem; a \\listoftheorems command; \
hyperref and autoref compatibility; a mechanism for restating \
entire theorems in a single macro call."
LICENSE = "LPPL-1.0"

PV = "2023.201.75svn65863"

RPM_NAME = "texlive-thmtools-2023.201.75svn65863-54.1.noarch.rpm"
RPM_HASH = "648521b3e4064ff0fb162bf760db724f69ddb08f072b49c51cec1f08929a6bfafd9b2ba50ebf12eaeb58d610d121df3a1f22abcd9671b80b7718e9b0587fef69"
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

RDEPENDS:${PN} += "/bin/sh \
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

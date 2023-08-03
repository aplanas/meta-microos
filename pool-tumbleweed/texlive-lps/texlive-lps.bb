SUMMARY = "Class for 'Logic and Philosophy of Science'"
DESCRIPTION = "The 'Logic and Philosophy of Science' journal is an online \
publication of the University of Trieste (Italy). The class \
builds on the standard article class to offer a format that \
LaTeX authors may use when submitting to the journal."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn21322"

RPM_NAME = "texlive-lps-2023.209.0.0.7svn21322-55.1.noarch.rpm"
RPM_HASH = "2b11a5d05735c7f4681980413d31c3abefc92a724c3e8f468e16fe38f23a6145e24ede0ee80b996ccae43e6e1be89459c41c2f6f342eb3808f37fa2072e32078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lps.cls \
texlive-lps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
tex-lastpage.sty \
tex-mathptmx.sty \
tex-titlesec.sty \
tex-titletoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

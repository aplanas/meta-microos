SUMMARY = "Provides various Unicode symbols"
DESCRIPTION = "This package provides various symbols from the Unicode in order \
to be able to use them originally in a school setting such as \
on worksheets."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.0svn63076"

RPM_NAME = "texlive-utfsym-2023.201.0.0.9.0svn63076-53.1.noarch.rpm"
RPM_HASH = "ef6c87150406ef2effea816bcf811cecbf4779f0c24a383f3754706616f9f353e5491c733c8acd3ca75036fb15f1ef34a001dacd13b072edf7a29904fe452e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utfsym.sty \
texlive-utfsym"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-newunicodechar.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

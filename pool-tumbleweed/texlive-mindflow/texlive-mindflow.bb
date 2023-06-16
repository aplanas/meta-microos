SUMMARY = "Write your ideas in a clear way"
DESCRIPTION = "This package provides an environment that has its own line \
numbers or markers and can be well distinguished from the main \
text, for writing your ideas or annotations."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65236"

RPM_NAME = "texlive-mindflow-2023.201.svn65236-54.1.noarch.rpm"
RPM_HASH = "50b0b73837efb2bbd9ab7b706b762b1f0b7e06e0effcc3b121d2e16ebd09cb6e98be9ada89ef8c5924ff6b865b9b3ce135f9a4de69bb03fd3fdcdc14f2fbff69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mindflow.sty \
texlive-mindflow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-lineno.sty \
tex-nowidow.sty \
tex-tcolorbox.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

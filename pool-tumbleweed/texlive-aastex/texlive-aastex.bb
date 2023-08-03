SUMMARY = "Macros for Manuscript Preparation for AAS Journals"
DESCRIPTION = "The bundle provides a document class for preparing papers for \
American Astronomical Society publications. Authors who wish to \
submit papers to AAS journals are strongly urged to use this \
class in preference to any of the alternatives available."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.3.1svn58057"

RPM_NAME = "texlive-aastex-2023.209.6.3.1svn58057-55.1.noarch.rpm"
RPM_HASH = "a2a6dddb9f9ed3ff8a6209d8d290a7d1ac29234d83d8f6c315e5d54041627d1a04ae10cdb10128d388fc119b7f0240dfa066853185332522eff036b7f0bb77ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aastex631.cls \
texlive-aastex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-epsf.sty \
tex-graphicx.sty \
tex-latexsym.sty \
tex-lineno.sty \
tex-longtable.sty \
tex-times.sty \
tex-ulem.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

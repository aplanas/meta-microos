SUMMARY = "Provides convenient key-value options for LaTeX package writers"
DESCRIPTION = "The options package provides easy to use key-value options for \
LaTeX package writers. It has a similar interface as pgfkeys \
with path options but comes with more built-in data types and \
more convenient support for families and searching."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39030"

RPM_NAME = "texlive-options-2023.201.1.0svn39030-54.1.noarch.rpm"
RPM_HASH = "4f2ca11dfb324cea4fbb5cab208f4e9751e5d98b0aeb7085bc638164839a5632c2e4e06b35f4cf0d4f1c1f973310328647f67fee4724ace2ec3badee06d563dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-options.sty \
texlive-options"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

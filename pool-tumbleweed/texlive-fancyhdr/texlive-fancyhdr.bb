SUMMARY = "Extensive control of page headers and footers in LaTeX2e"
DESCRIPTION = "The package provides extensive facilities, both for \
constructing headers and footers, and for controlling their use \
(for example, at times when LaTeX would automatically change \
the heading style in use)."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1svn64977"

RPM_NAME = "texlive-fancyhdr-2023.209.4.1svn64977-53.1.noarch.rpm"
RPM_HASH = "006e48fd42a1c9e7665bfbd661a147882466de2297249c0a89f6b2333e9a07f08c646a07b94e0e720047124ec0311c6cedab2554a81980d386795c906fd38936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extramarks.sty \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
texlive-fancyhdr"

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

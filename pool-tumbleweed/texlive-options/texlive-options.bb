SUMMARY = "Provides convenient key-value options for LaTeX package writers"
DESCRIPTION = "The options package provides easy to use key-value options for \
LaTeX package writers. It has a similar interface as pgfkeys \
with path options but comes with more built-in data types and \
more convenient support for families and searching."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39030"

RPM_NAME = "texlive-options-2023.209.1.0svn39030-55.1.noarch.rpm"
RPM_HASH = "d5cf2bcc007c2acac3fa130d5381714b9a3f56c76d773bd23459c41a79f4aaf6a5193ea01cb04f8e88d899bcf1716b297f0325efcc48f97bf9e2ba40ed60536f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-options.sty \
texlive-options"

RDEPENDS:${PN} += "/usr/bin/sh \
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

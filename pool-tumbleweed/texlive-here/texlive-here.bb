SUMMARY = "Emulation of obsolete package for 'here' floats"
DESCRIPTION = "Provides the H option for floats in LaTeX to signify that the \
environment is not really a float (and should therefore be \
placed 'here' and not float at all). The package emulates an \
older package of the same name, which has long been suppressed \
by its author. The job is done by nothing more than loading the \
float package, which has long provided the option in an \
acceptable framework."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn16135"

RPM_NAME = "texlive-here-2023.209.svn16135-54.1.noarch.rpm"
RPM_HASH = "53b58ba35d74b7a75885ae2a43cb2b6e4cf814cc94ac518049f081484cf12c519477e8391d84a8ee3e6d7d67b84ac7113e65c4cfc8ba7151a4f21c570bfabab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-here.sty \
texlive-here"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

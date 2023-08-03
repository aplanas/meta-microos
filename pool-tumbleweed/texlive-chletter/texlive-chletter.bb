SUMMARY = "Class for typesetting letters to Swiss rules"
DESCRIPTION = "The class enables composition of letters fitting into Swiss C5 \
& C6/5 windowed envelopes. No assumption is made about the \
language used. The class is based on the standard LaTeX classes \
and is compatible with the LaTeX letter class. It is not \
limited to letters and may be used as a generic document class; \
it is used with the chextras package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn20060"

RPM_NAME = "texlive-chletter-2023.209.2.0svn20060-54.1.noarch.rpm"
RPM_HASH = "56c4c677f803e6e29a419588416c143a174727921735190d5a48cbc683d8e5a38700833749ae667ae8ce66613c8b054f90a6c3256a03b3450141f273df22e938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chletter.cls \
texlive-chletter"

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

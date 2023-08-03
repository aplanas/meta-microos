SUMMARY = "Interface for LaTeX-based typesetting in MetaPost"
DESCRIPTION = "The MetaPost package latexMP implements a user-friendly \
interface to access LaTeX-based typesetting capabilities in \
MetaPost. The text to be typeset is given as string. This \
allows even dynamic text elements, for example counters, to be \
used in labels. Compared to other implementations it is much \
more flexible, since it can be used as direct replacement for \
btex.etex, and much faster, compared for example to the \
solution provided by tex.mp."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2.1svn55643"

RPM_NAME = "texlive-latexmp-2023.209.1.2.1svn55643-55.1.noarch.rpm"
RPM_HASH = "6593c671b0a7d2b6469af279f417f3932521c3cd4d334c3743aeb979ec216176de24cf4dd40b3b0762b2ebdf501d9e439b1299ce4fc233f5a5626f608109049c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexmp"

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

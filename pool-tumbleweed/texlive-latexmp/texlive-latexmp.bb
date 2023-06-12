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

PV = "2023.201.1.2.1svn55643"

RPM_NAME = "texlive-latexmp-2023.201.1.2.1svn55643-54.1.noarch.rpm"
RPM_HASH = "88f69114e181ba27f860441fd94d9a3237182b49ac8944f01b9ed91bf5220e45599a968b3a95a1ae36df4a486b0a98a67c7411609e46f4784f7f5f1d2ecdf006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexmp"
RDEPENDS:${PN} += "/bin/sh \
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

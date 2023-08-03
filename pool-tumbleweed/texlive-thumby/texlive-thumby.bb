SUMMARY = "Create thumb indexes for printed books"
DESCRIPTION = "The package can generate thumb indexes for your document. It \
features printing thumb indexes on one- or two-sided pages, \
along with background- and foreground-color selection and full \
LaTeX styling of the chapter numbers in the thumb indexes. The \
height of each thumb index is automatically chosen based on the \
number of chapters in your document, while the width is chosen \
by the user. The package is designed to work with the memoir \
class, and also requires PerlTeX and tikz/"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn16736"

RPM_NAME = "texlive-thumby-2023.209.0.0.1svn16736-55.1.noarch.rpm"
RPM_HASH = "67450a10bcf30d2409561779fc0ce30ab55695150d190e0239084fcfc41d061dfc09c6f1e6867edd1fa185e4bbde5a2ef6caec0cb3e6fb57438bbd4b73ba65f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thumby.sty \
texlive-thumby"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bophook.sty \
tex-perltex.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

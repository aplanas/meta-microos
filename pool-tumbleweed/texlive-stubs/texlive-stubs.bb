SUMMARY = "Create tear-off stubs at the bottom of a page"
DESCRIPTION = "The \\stubs command creates as many repetitions as possible of \
its argument, at the bottom of the page; these stubs may be \
used (for example) for contact information."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.1svn66204"

RPM_NAME = "texlive-stubs-2023.201.0.0.1.1svn66204-57.1.noarch.rpm"
RPM_HASH = "73f3007bd01386f1cf107a83710b148680b649b5a0723a551c9f60258f7a3ed79d7f7e1046b30b7cca13b8255ef3c2d19b4bd8f0142feb16402e006adfa2ccc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(stubs.sty) \
texlive-stubs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
tex(textpos.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

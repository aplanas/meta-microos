SUMMARY = "A LaTeX class for typesetting stage plays"
DESCRIPTION = "This is a LaTeX class for typesetting stage plays, based on the \
plari class written by Antti-Juhani Kaijanaho in 1998. It has \
been updated and several formatting changes have been made to \
it--most noticibly there are no longer orphans."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-sides-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "b859a684a8e15af2d844bfe79fe324d96df1e4a68686b0093a3a6e1d095f97f7ed55dfbb36f84c1f99a7f8107512d9dba0d2ed86d9a4244d8bf003bf1d6281c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sides.cls \
texlive-sides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

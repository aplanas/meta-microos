SUMMARY = "A LaTeX class for typesetting stage plays"
DESCRIPTION = "This is a LaTeX class for typesetting stage plays, based on the \
plari class written by Antti-Juhani Kaijanaho in 1998. It has \
been updated and several formatting changes have been made to \
it--most noticibly there are no longer orphans."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-sides-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "aabbb820b3c3098d4d790aa95519bf268295de85c61570dd370aa76706f9f2588d078656f31d298e7a464bac2a2279b6c2a4e5460ed729eaea5111430179edc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sides.cls) \
texlive-sides"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(report.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

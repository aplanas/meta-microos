SUMMARY = "Declare global variables"
DESCRIPTION = "This package allows the user to declare a variable which can \
then be used anywhere else in a document, including before it \
was declared."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49962"

RPM_NAME = "texlive-globalvals-2023.209.1.1svn49962-54.2.noarch.rpm"
RPM_HASH = "77d07355b662cdaee3fb03ebeddf23b8eefb30f8f917e28526f6a8110e4b35a453244a7afe506d4d63807ee570cc76ce7e13935217b6d07c07d0f5460dcc9666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-globalvals.sty \
texlive-globalvals"

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

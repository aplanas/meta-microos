SUMMARY = "Support for use of memoir in Serbian"
DESCRIPTION = "The package provides a number of commands for adjusting memoir \
output to Serbian style."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn45818"

RPM_NAME = "texlive-srbook-mem-2023.209.svn45818-58.1.noarch.rpm"
RPM_HASH = "dc1502cd9a6660787ee3499716842841c45a8ef6f3b2671bc478160e37b0c1f366b6d056a50baf349b749c5096a15545c0857432999a34c7a8e0811783396696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-srbook-mem.sty \
texlive-srbook-mem"

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

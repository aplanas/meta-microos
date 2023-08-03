SUMMARY = "Extra harpoons, using the graphics package"
DESCRIPTION = "Provides over- and under-harpoon symbol commands; the harpoons \
may point in either direction, with the hook pointing up or \
down. The covered object is provided as an argument to the \
commands, so that they have the look of accent commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn21327"

RPM_NAME = "texlive-harpoon-2023.209.1.0svn21327-54.1.noarch.rpm"
RPM_HASH = "91aad4cd97d6f68af607489e2ca5ffdac82b4ff6db9fb1659e99f62d42d28afa817d9271672ef362dc021cc5383a8e69386f673332a1ab494d9ed2cabba05b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harpoon.sty \
texlive-harpoon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

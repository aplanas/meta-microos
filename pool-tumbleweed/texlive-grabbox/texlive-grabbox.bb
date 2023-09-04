SUMMARY = "Read an argument into a box and execute the code afterwards"
DESCRIPTION = "The package provides the command \\grabbox, which grabs an \
argument into a box and executes the code afterwards."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65223"

RPM_NAME = "texlive-grabbox-2023.209.1.4svn65223-54.2.noarch.rpm"
RPM_HASH = "49923f21857a707e59d43a7a447f92468fa12f0fa030c5e64ef1b80b88d9fdd05b3f26e55fadd17e05135e718f6da57b44ac9914a42a3c6bcf51490d39de86cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grabbox.sty \
texlive-grabbox"

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

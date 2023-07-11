SUMMARY = "An 'end of proof' sign"
DESCRIPTION = "This package provides an additional 'end of proof' sign. The \
command's name is \\wasserdicht."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55643"

RPM_NAME = "texlive-endofproofwd-2023.201.svn55643-53.2.noarch.rpm"
RPM_HASH = "f46344b37c0c5a5742068387dc606ef74622fcacbbd0dedf680dbe6cd0858531675d9fb8ed1b146b1b351ae59d80d2662918d53fddb4817ea60dee1216588eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endofproofwd.sty \
texlive-endofproofwd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-import.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

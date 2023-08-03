SUMMARY = "E-TeX showbox facilities for exploration purposes"
DESCRIPTION = "The command \\logbox does \\showbox without stopping the \
compilation. The package's main command is \\viewbox*: the box \
is typeset (copied) with its dimensions, and its contents are \
logged in the .log file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24499"

RPM_NAME = "texlive-logbox-2023.209.1.0svn24499-55.1.noarch.rpm"
RPM_HASH = "33395a9611d349558eb94388eca783e6cbe4d22ce586d1200cf92838f03672aa4aa538f3c5dcc7c2899c7830ec91491769cf7b60bb06ff52dfc182a79dbe7eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logbox.sty \
texlive-logbox"

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

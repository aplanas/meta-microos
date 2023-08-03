SUMMARY = "Expandable \\@testopt (and related) macros"
DESCRIPTION = "The package provides an expandable variant of the LaTeX kernel \
command \\@testopt, named \\@expandable@testopt, and a more \
general \\@expandable@ifopt, both intended for package writers. \
Also we have a variant of \\newcommand which uses these macros \
to check for optional arguments."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-exp-testopt-2023.209.0.0.3svn15878-53.1.noarch.rpm"
RPM_HASH = "ad38ebb83ce803a7331ad1d9635cdbaf616ff16f21e7322754f3f3e0e8a7c127eb81bd62d73eae309ce81ecbfddddedb5c011587f7693e425548b8c330080469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exp-testopt.sty \
texlive-exp-testopt"

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

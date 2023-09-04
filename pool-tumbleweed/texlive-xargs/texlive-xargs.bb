SUMMARY = "Define commands with many optional arguments"
DESCRIPTION = "The package provides extended versions of \\newcommand and \
related LaTeX commands, which allow easy and robust definition \
of macros with many optional arguments, using a clear and \
simple xkeyval-style syntax."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-xargs-2023.209.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "b0e85fd0df7693c4ad51f50bfc99811ff75c43e2df541168b1c9ab13a2976edfda54eda630def7d6ce14abdb996e81dd73211c48b8e58eae2c034c9d51910005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xargs.sty \
texlive-xargs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

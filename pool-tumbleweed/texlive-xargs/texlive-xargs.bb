SUMMARY = "Define commands with many optional arguments"
DESCRIPTION = "The package provides extended versions of \\newcommand and \
related LaTeX commands, which allow easy and robust definition \
of macros with many optional arguments, using a clear and \
simple xkeyval-style syntax."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-xargs-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "5e7909d298d2ea24d299d16d3899001c1de50315b947bcdb8e2d7e58a2d13664ba5a5650219c80a631e8538d7bc7ede2b0014433ec60931d28b4fbc449ea92a8"
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

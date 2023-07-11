SUMMARY = "Define commands with many optional arguments"
DESCRIPTION = "The package provides extended versions of \\newcommand and \
related LaTeX commands, which allow easy and robust definition \
of macros with many optional arguments, using a clear and \
simple xkeyval-style syntax."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-xargs-2023.201.1.1svn15878-52.2.noarch.rpm"
RPM_HASH = "e504ceb3251496cb7bba3962b8a7f3dd8444822a91dab4e8c4a502628fed35ef9895709acce992c89300adf59c9a19faf8b57dd0ee51a137a6b86e741326fc63"
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

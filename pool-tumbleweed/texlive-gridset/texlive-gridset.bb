SUMMARY = "Grid, a.k.a. in-register, setting"
DESCRIPTION = "Grid setting -- also known as strict in-register setting -- is \
something, that should be done for a lot of documents but is \
not easy using LaTeX. The package helps to get the information \
needed for grid setting. It does not implement auto grid \
setting, but there is a command \\vskipnextgrid, that moves to \
the next grid position. This may be enough under some \
circumstances, but in other circumstances it may fail. Thus \
gridset is only one more step for grid setting, not a complete \
solution."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn53762"

RPM_NAME = "texlive-gridset-2023.201.0.0.3svn53762-53.2.noarch.rpm"
RPM_HASH = "2f1ab8a28a0df90276121d825f7bff3009322a45767f8690f2d20f7cbbe220abc947e3b643d154235ddd3406adb9be7cc7149b512070d0e2e61db256378bad7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gridset.sty \
texlive-gridset"

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

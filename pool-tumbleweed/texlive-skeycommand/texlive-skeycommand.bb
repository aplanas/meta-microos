SUMMARY = "Create commands using parameters and keyval in parallel"
DESCRIPTION = "The package provides tools for defining LaTeX commands and \
environments using combinations of parameters and keys. All the \
facilities of the ltxkeys and skeyval packages are available to \
the user of skeycommand."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn24652"

RPM_NAME = "texlive-skeycommand-2023.209.0.0.4svn24652-58.1.noarch.rpm"
RPM_HASH = "60ffc484a4fd2345cc1bd9b40058202f89bb3470c0009e37cea883cb676d2a0c72f21ba733488a5619a05599d747b3cd8c0144ae47dd51fe41f6301b0f9005d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skeycommand.sty \
texlive-skeycommand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

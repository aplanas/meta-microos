SUMMARY = "The new \\makecommand command always (re)defines a command"
DESCRIPTION = "The package provides a \\makecommand command, which is like \
\\(re)newcommand except it always (re)defines a command. There \
is also \\makeenvironment and \\provideenvironment for \
environments."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-makecmds-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "6d359a7c49cc7e1abc255c1f03148b48d19275c7c8792b0d79c4fa1a4576ccd14d891b91dcc9db16e57caba047a7551de2019496df06f518ce52643fd1f7ca4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(makecmds.sty) \
texlive-makecmds"

RDEPENDS:${PN} += "/bin/sh \
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

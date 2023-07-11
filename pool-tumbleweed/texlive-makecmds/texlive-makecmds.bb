SUMMARY = "The new \\makecommand command always (re)defines a command"
DESCRIPTION = "The package provides a \\makecommand command, which is like \
\\(re)newcommand except it always (re)defines a command. There \
is also \\makeenvironment and \\provideenvironment for \
environments."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-makecmds-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "d9aacdea406159f022759b71efead493b913c98b51d2d817a1d7f9f27294c689ddea80648537637f6845ee12134f99c2cee0652f15f6bd86367c9befaefc8d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makecmds.sty \
texlive-makecmds"

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

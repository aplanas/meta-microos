SUMMARY = "Get command name reliably"
DESCRIPTION = "Extracts the letters of a command's name (e.g., foo for command \
\\foo), in a reliable way."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-cmdstring-2023.201.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "0ef175ccb1371c09315e55ba6afe1fed1bfbe35cfcdb9591171260f2e2c8b8c7100f21bdcfc6331f828c3d5f4a539cd0641270a4fe44efd9baa57c25e4461b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmdstring.sty \
texlive-cmdstring"

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

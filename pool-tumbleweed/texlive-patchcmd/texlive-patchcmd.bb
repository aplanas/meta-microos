SUMMARY = "Change the definition of an existing command"
DESCRIPTION = "The package provides a command \\patchcommand that can be used \
to add material at the beginning and/or the end of the \
replacement text of an existing macro. It works for macros with \
any number of normal arguments, including those that were \
defined with \\DeclareRobustCommand."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn41379"

RPM_NAME = "texlive-patchcmd-2023.201.1.05svn41379-51.1.noarch.rpm"
RPM_HASH = "6ce98eb44df8cff5cd4451f33423f25354a1ab0a2ca35d4937ab764d5015d545031a22d2b69ffeb54f78852ab7b848b04cec09712afcfb5d36f942085b936e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-patchcmd.sty \
texlive-patchcmd"

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

SUMMARY = "Change the definition of an existing command"
DESCRIPTION = "The package provides a command \\patchcommand that can be used \
to add material at the beginning and/or the end of the \
replacement text of an existing macro. It works for macros with \
any number of normal arguments, including those that were \
defined with \\DeclareRobustCommand."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn41379"

RPM_NAME = "texlive-patchcmd-2023.209.1.05svn41379-52.1.noarch.rpm"
RPM_HASH = "b3b99df86e25fd60e82004bab969b858cf4018a97124e3cf502865018f3228d8a504cec29e7ea479b6b371c67fbb6ebe5125c6ef194de6b5cd40fa402f5ecd9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-patchcmd.sty \
texlive-patchcmd"

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

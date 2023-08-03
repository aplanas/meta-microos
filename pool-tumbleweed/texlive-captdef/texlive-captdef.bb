SUMMARY = "Declare free-standing \\caption commands"
DESCRIPTION = "The \\DeclareCaption command defines a class of caption command \
associated with the counter specified to the command. These \
commands are free-standing (i.e., don't need to be inside a \
float environment). The package uses \\DeclareCaption to define \
\\figcaption and \\tabcaption, which can be used outside figure \
or table environments."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17353"

RPM_NAME = "texlive-captdef-2023.209.svn17353-53.1.noarch.rpm"
RPM_HASH = "14ce25178ae48fca55277ae39c8fe8c51ba64dcb72e99d05f1dde076258744fa6f58f06b9bda5ecc77db499aa4a6fb927d6cddbea6a985bf9a8db36660a7d0f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-captdef.sty \
texlive-captdef"

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

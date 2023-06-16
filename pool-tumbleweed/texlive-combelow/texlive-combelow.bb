SUMMARY = "Typeset 'comma-below' letters, as in Romanian"
DESCRIPTION = "The package defines a command \\cb that positions a comma below \
a letter, as required (for example) in Romanian typesetting. \
The command is robust, but interferes with hyphenation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.99fsvn18462"

RPM_NAME = "texlive-combelow-2023.201.0.0.99fsvn18462-53.1.noarch.rpm"
RPM_HASH = "9527a0555cee986f58fab246f6efd9d4ad6e6ce3d47f295e845e9836bcff89046dd416551e84e8b3212f04ba4a5fb344efad2106a2f209c706513809184f7f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-combelow.sty \
texlive-combelow"

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

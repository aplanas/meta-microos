SUMMARY = "Typeset 'comma-below' letters, as in Romanian"
DESCRIPTION = "The package defines a command \\cb that positions a comma below \
a letter, as required (for example) in Romanian typesetting. \
The command is robust, but interferes with hyphenation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.99fsvn18462"

RPM_NAME = "texlive-combelow-2023.209.0.0.99fsvn18462-54.1.noarch.rpm"
RPM_HASH = "9374be420caf4fc974db14df7daef11f390a51397fbac8b5997fbacdd4b5aac0f63330d86bf7c47873e53d271f3768ff75d6ab6ec5cadde8282999f99755420a"
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

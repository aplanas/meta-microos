SUMMARY = "Control over the typesetting of the \\maketitle command"
DESCRIPTION = "The titling package provides control over the typesetting of \
the \\maketitle command and \\thanks commands, and makes the \
\\title, \\author and \\date information permanently available. \
Multiple titles are allowed in a single document. New titling \
elements can be added and a titlepage title can be centered on \
a physical page."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1dsvn15878"

RPM_NAME = "texlive-titling-2023.201.2.1dsvn15878-52.1.noarch.rpm"
RPM_HASH = "c5e000515e48a5a5d2c8b5a28ff280b26e76d462338a9d2cde3a4c3c8d4fff13af532cd062514689da5de6c6279a877c54dbbfb44953e0e7593381bc6faf6bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titling.sty \
texlive-titling"

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

SUMMARY = "Control over the typesetting of the \\maketitle command"
DESCRIPTION = "The titling package provides control over the typesetting of \
the \\maketitle command and \\thanks commands, and makes the \
\\title, \\author and \\date information permanently available. \
Multiple titles are allowed in a single document. New titling \
elements can be added and a titlepage title can be centered on \
a physical page."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1dsvn15878"

RPM_NAME = "texlive-titling-2023.209.2.1dsvn15878-53.1.noarch.rpm"
RPM_HASH = "6dd4018672a2c903bd056e233652022e480c80616ca8255fa93b8e6519904a1c96d7e535e26f3790212dfd024ae0adba7770125a9484b672e865dd419b76ad92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titling.sty \
texlive-titling"

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

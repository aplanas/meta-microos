SUMMARY = "Yet Another Key System"
DESCRIPTION = "YaX is advertised as a key system, but it rather organizes \
attributes in parameters, which parameters can be executed, so \
that YaX is halfway between key management and macro definition \
(and actually hopes to provide a user's interface). Values \
assigned to attributes can be retrieved and tested in various \
ways, with full expandability ensured as much as possible. \
Finally, YaX's syntax is a quite peculiar (as few braces as \
possible), but may be customized. YaX is based on texapi and \
thus requires e-TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn54080"

RPM_NAME = "texlive-yax-2023.209.1.03svn54080-53.1.noarch.rpm"
RPM_HASH = "4ade23bfddd5b2651ce307383163653ec3de6a099d6f3b792dfa62d06652889e2f6745254cf35b444deaf9ce8bac1a187714e82dec8973db48a9456bfe97d433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-yax.tex \
tex-yax.sty \
tex-yax.tex \
texlive-yax"

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

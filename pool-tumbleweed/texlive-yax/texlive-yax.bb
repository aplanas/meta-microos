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

PV = "2023.201.1.03svn54080"

RPM_NAME = "texlive-yax-2023.201.1.03svn54080-52.2.noarch.rpm"
RPM_HASH = "9f51b9bc36841a090d84bdd34f14e47b3d04ed35757c9aba1b866e945e1ddf787b7d526be8d182700c2e28b7a24a485845d3880b868de9e8d81df7cc634c50f0"
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

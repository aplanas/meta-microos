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

RPM_NAME = "texlive-yax-2023.201.1.03svn54080-52.1.noarch.rpm"
RPM_HASH = "21e6942f53113cfd77037903d28a02ab8cd655d4f82813cfe133f9a49817e4fea6877023df4a363d1fda1c80b35388b07f052c50f543ae9467124e1e05c7dfa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-yax.tex \
tex-yax.sty \
tex-yax.tex \
texlive-yax"

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

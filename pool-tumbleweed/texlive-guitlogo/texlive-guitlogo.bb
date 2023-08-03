SUMMARY = "Macros for typesetting the GuIT logo"
DESCRIPTION = "This package provides some commands useful to correctly write \
the logo of 'Gruppo Utilizzatori Italiani di TeX' (Italian TeX \
User Group), using the default document color or any other \
color the user may ever choose, in conformity with the logo's \
scheme as seen on the group's website https://www.guitex.org. \
Likewise, commands are provided that simplify the writing of \
the GuIT acronym's complete expansion, of the addresses of the \
group's internet site and public forum, and the meeting \
'GuITmeeting' and the magazine Ars TeXnica's logo. Optionally, \
using hyperref, the outputs of the above cited commands can \
become hyperlinks to the group's website \
https://www.guitex.org. The Documentation is available in \
Italian only."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0_alpha.4svn55741"

RPM_NAME = "texlive-guitlogo-2023.209.1.0.0_alpha.4svn55741-54.1.noarch.rpm"
RPM_HASH = "4938b83767eb22223a8e2fa7ac0a32a55e874e0355d60ce20b8b804b26f42eff0cccd8d19772ae2fbe3f6fd6eea03616b114d111905d257f225ad95e39413fae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guit.cfg \
tex-guit.sty \
texlive-guitlogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

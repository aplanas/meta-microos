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

PV = "2023.201.1.0.0_alpha.4svn55741"

RPM_NAME = "texlive-guitlogo-2023.201.1.0.0_alpha.4svn55741-53.2.noarch.rpm"
RPM_HASH = "8b80664d954bb095d73d649588a74d4be527dd1000b6e8eadc6c76bd2d05c8eecfdfe48e4bae97ca3d7ff9e713212eb86f3e36f2f3739d584b350ba2590a1826"
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

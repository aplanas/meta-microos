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

RPM_NAME = "texlive-guitlogo-2023.201.1.0.0_alpha.4svn55741-53.1.noarch.rpm"
RPM_HASH = "73e3ac199204396211744997081657950086f74aeca586f1844b45d02000939902c5128e356c25236fa3ec4c7646e43817053ddfa0cdd32ea0e0836271374b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(guit.cfg) \
tex(guit.sty) \
texlive-guitlogo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphics.sty) \
tex(url.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

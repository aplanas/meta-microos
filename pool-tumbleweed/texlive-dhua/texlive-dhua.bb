SUMMARY = "German abbreviations using thin space"
DESCRIPTION = "The package provides commands for those abbreviations of German \
phrases for which the use of thin space is recommended. Setup \
commands \\newdhua and \\newtwopartdhua are provided, as well as \
commands for single cases (such as \\zB for 'z. B.', saving the \
user from typing such as 'z.\\,B.'). To typeset the \
documentation, the niceverb package, version 0.44, or later, is \
required. Das Paket `dhua' stellt Befehle fur sog. \
mehrgliedrige Abkurzungen bereit, fur die schmale Leerzeichen \
(Festabstande) empfohlen werden (Duden, Wikipedia). In die \
englische Paketdokumentation sind deutsche Erlauterungen \
eingestreut."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn24035"

RPM_NAME = "texlive-dhua-2023.209.0.0.11svn24035-53.1.noarch.rpm"
RPM_HASH = "ab23a3932638acb82452392d579f23ad62d9281aae4eec09838e4b4eebdce036911ce78ecdf09f8b961eedf4f976ca7c6161ed47818b9a4d57fd6f17908f71f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dhua.cfg \
tex-dhua.sty \
texlive-dhua"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

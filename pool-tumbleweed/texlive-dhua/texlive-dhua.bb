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

PV = "2023.201.0.0.11svn24035"

RPM_NAME = "texlive-dhua-2023.201.0.0.11svn24035-52.1.noarch.rpm"
RPM_HASH = "5bf07cf3d1df35b4cafcd4ffcf5c86a4716bcf6a586e94f953f0369b11f43b03563e3b28e3376286cb127f9bd84e67daf892beb3437a53778f228d239d1e5cd3"
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

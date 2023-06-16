SUMMARY = "A LaTeX document class for the Journal of Electrical Bioimpedance"
DESCRIPTION = "A document class for writing articles to the Journal of \
Electrical Bioimpedance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21758"

RPM_NAME = "texlive-elbioimp-2023.201.1.2svn21758-53.1.noarch.rpm"
RPM_HASH = "d982b32f2a88d247243464861abc3fa6e03e674e7c7b5760313f71f93f387fb262cc6fe00849daafd866e05315c5d36bb68d049c793a3f7aec5d7a1d8b81807b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elbioimp.cls \
texlive-elbioimp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
tex-mathptmx.sty \
tex-type1cm.sty \
tex-type1ec.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

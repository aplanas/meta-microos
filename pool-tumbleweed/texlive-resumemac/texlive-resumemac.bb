SUMMARY = "Plain TeX macros for resumes"
DESCRIPTION = "A set of macros is provided, together with an file that offers \
an example of use."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-resumemac-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "e7ca986ea7435e589e6456ceba1096a673d7a048b020aff3dc5a8099e98255c7b0b9245a81c8ed1692889d843d5c4a2ea55068d3dce36d9f3605ac5491a96723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resumemac.tex \
texlive-resumemac"

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

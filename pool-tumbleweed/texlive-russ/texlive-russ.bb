SUMMARY = "LaTeX in Russian, without babel"
DESCRIPTION = "The package aims to facilitate Russian typesetting (based on \
input using MicroSoft Code Page 1251). Russian hyphenation is \
selected, and various mathematical commands are set up in \
Russian style. Furthermore all Cyrillic letters' catcodes are \
set to 'letter', so that commands with Cyrillic letters in \
their names may be defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25209"

RPM_NAME = "texlive-russ-2023.209.svn25209-54.1.noarch.rpm"
RPM_HASH = "d8e78e03d2006ecb98002857d3f661ccd01ef2b6b95d8078cfc9fb82216460e74e2d2c7d2e65bd2a920ddd2f7716883ce387662018943b40f7ccd6e8ada24b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-russ.sty \
texlive-russ"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
tex-t2aenc.def \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "A bash wrapper for pdfTeX limiting its output to relevant errors"
DESCRIPTION = "This package provides a bash script aiming at reducing pdfTeX's \
output to relevant errors, which are displayed in a red bold \
font. The project originally started as a TeX StackExchange \
answer."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.0svn49169"

RPM_NAME = "texlive-pdftex-quiet-2023.209.1.1.0svn49169-52.1.noarch.rpm"
RPM_HASH = "bb28f49b6d67215bb02cf2d947485ee475258b6ab10b858f7e208a313d65fd07c45cd1c2a070a6294f1e28a326bfef9c161e31c43dc15aabf4527c6508672820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftex-quiet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdftex-quiet-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

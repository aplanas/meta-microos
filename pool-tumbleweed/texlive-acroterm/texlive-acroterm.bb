SUMMARY = "Manage and index acronyms and terms"
DESCRIPTION = "Yet another package for acronyms: the package offers simple \
markup of acronyms and technical terms in the text, giving an \
index each of terms and acronyms with their expanded form."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn61719"

RPM_NAME = "texlive-acroterm-2023.209.0.0.1svn61719-55.1.noarch.rpm"
RPM_HASH = "5c71ada48601f24356d451d18999f75669351eb7b6e4ace0cb4797c465a5c964114ccbdcc76ced75bf8f3febe8b930ff7b61bc64365d10521be38b73b14ee51d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acroterm.sty \
texlive-acroterm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-splitidx.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

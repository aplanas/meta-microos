SUMMARY = "French translation of booktabs documentation"
DESCRIPTION = "The translation comes from a collection provided by Benjamin \
Bayart."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn21948"

RPM_NAME = "texlive-booktabs-fr-2023.209.1.00svn21948-53.1.noarch.rpm"
RPM_HASH = "e37756ca3f73d489ddfc312fb1eaeb036e5c606c5516acd56facb4414bc34fd7f0ab4ad839a209cf546cbdcbc1c19714cbadb41346169df532a08f79e664a47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-booktabs-fr"

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

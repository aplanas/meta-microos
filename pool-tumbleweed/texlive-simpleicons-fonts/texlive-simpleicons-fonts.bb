SUMMARY = "Severed fonts for texlive-simpleicons"
DESCRIPTION = "The  separated fonts package for texlive-simpleicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.8.6.0svn66328"

RPM_NAME = "texlive-simpleicons-fonts-2023.209.8.6.0svn66328-54.1.noarch.rpm"
RPM_HASH = "5ed464526505784fdf9c8126d7d620863eecea1f9367258391db664f77c1816a03dcfdd6592fd6e653a5b3e287569037749ef68ae614598db5da102bb5876065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-simpleicons-fonts \
font-simpleicons \
texlive-simpleicons-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm

SUMMARY = "Severed fonts for texlive-metapost"
DESCRIPTION = "The  separated fonts package for texlive-metapost"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.svn66264"

RPM_NAME = "texlive-metapost-fonts-2023.209.svn66264-55.1.noarch.rpm"
RPM_HASH = "96bccd3362606ce91a6566f3fdedbe0afec57bef5b842329b788ce1d255bba6eb9829b2b31ba371b857ee56d23b6495003129e7f1d0abf40a1e30817f9846743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-freeeuro \
texlive-metapost-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm

SUMMARY = "Severed fonts for texlive-plimsoll"
DESCRIPTION = "The  separated fonts package for texlive-plimsoll"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1svn56605"

RPM_NAME = "texlive-plimsoll-fonts-2023.209.1svn56605-53.1.noarch.rpm"
RPM_HASH = "43073ec6bbb59ced21c2e8659e9ae31c3b0513641ad16a23d02b4a6305e6a58f1ee3900ae1c7c0a80273f5410e0a406837dfc0a2377836d41a3c50616d5a68c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-plimsoll \
texlive-plimsoll-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm

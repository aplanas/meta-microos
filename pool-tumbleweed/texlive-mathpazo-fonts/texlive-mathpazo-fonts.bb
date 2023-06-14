SUMMARY = "Severed fonts for texlive-mathpazo"
DESCRIPTION = "The  separated fonts package for texlive-mathpazo"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.003svn52663"

RPM_NAME = "texlive-mathpazo-fonts-2023.201.1.003svn52663-52.1.noarch.rpm"
RPM_HASH = "520688c49d42dbe314484e1c5d7cd85dcf489124a68d132f6d04aa94e44a6d70c61ba8aa1548fb05c35b9ae53f29c7bca852bcd5e30e691e3f3a70b017d2806e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-pazomath \
font-pazomathblackboardbold \
texlive-mathpazo-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm

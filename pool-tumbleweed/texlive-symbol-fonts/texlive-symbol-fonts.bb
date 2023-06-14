SUMMARY = "Severed fonts for texlive-symbol"
DESCRIPTION = "The  separated fonts package for texlive-symbol"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-symbol-fonts-2023.201.svn61719-57.1.noarch.rpm"
RPM_HASH = "6c526810af710832cd513f598a8145a70c8b7ef8762eee65349d7cc8d3f311e59323d5fbaa7e74806305ca339fba8bf8edafbdf5d1106fc959e1e66640ddf77a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-standardsymbolsl \
texlive-symbol-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm

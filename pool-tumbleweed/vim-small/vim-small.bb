SUMMARY = "Vim with reduced features"
DESCRIPTION = "Vim compiled with reduced feature set such as no script \
interpreters built in"
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-small-9.0.1632-1.1.aarch64.rpm"
RPM_HASH = "9593395948629a61c09869817f1c630ee509351e023b0126294b799811a945daeb36fc347cb662e18c39f197441536dba0daa8f07e67e7462a80b79f5108cd9c"

RPROVIDES:${PN} += "vi \
vim-client \
vim-small"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libm.so.6 \
libselinux.so.1 \
libtinfo.so.6 \
vim-data-common"

inherit rpm

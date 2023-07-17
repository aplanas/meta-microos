SUMMARY = "Vim with reduced features"
DESCRIPTION = "Vim compiled with reduced feature set such as no script \
interpreters built in"
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-small-9.0.1632-2.1.aarch64.rpm"
RPM_HASH = "d89e281f64888510ea7f7b99460c865ddc6ae34ef975111d1867f4c389778346f08fb04f1e15c2d794a1fffdb436187780df7e178ccb9b2034a94fcba06f9e86"

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

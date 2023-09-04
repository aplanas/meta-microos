SUMMARY = "Vim with reduced features"
DESCRIPTION = "Vim compiled with reduced feature set such as no script \
interpreters built in"
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-small-9.0.1632-2.2.aarch64.rpm"
RPM_HASH = "79250a99693ff14a8238666dd0add2030f6cfc682e8b3ae5812297e67d0e23561480975e21dc8a15495ac174a81dab69f92d28565955ca850967d70078aa6414"

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

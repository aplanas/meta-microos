SUMMARY = "Vim with reduced features"
DESCRIPTION = "Vim compiled with reduced feature set such as no script \
interpreters built in"
LICENSE = "Vim"

PV = "9.0.1572"

RPM_NAME = "vim-small-9.0.1572-1.1.aarch64.rpm"
RPM_HASH = "f0d3b428e94ddbe401133ed3554481bf419dc088de97ca50472abc6286def6750f612479faea101dd141250ecac67b3300d1c09128e279e85e7b621eb582d454"

RPROVIDES:${PN} += "vi \
vim-small \
vim-small(aarch-64) \
vim_client"

RDEPENDS:${PN} += "/bin/sh \
alts \
ld-linux-aarch64.so.1()(64bit) \
libacl.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libselinux.so.1()(64bit) \
libtinfo.so.6()(64bit) \
vim-data-common"

inherit rpm

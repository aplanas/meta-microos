SUMMARY = "Vi IMproved"
DESCRIPTION = "Vim (Vi IMproved) is an almost compatible version of the UNIX editor \
vi. Almost every possible command can be performed using only ASCII \
characters. Only the 'Q' command is missing (you do not need it). Many \
new features have been added: multilevel undo, command line history, \
file name completion, block operations, and editing of binary data."
LICENSE = "Vim"

PV = "9.0.1572"

RPM_NAME = "vim-9.0.1572-1.1.aarch64.rpm"
RPM_HASH = "c045d8a8b6cf87ed3a4c43208547d528b89ad9e3ab9b218b25d0e47ed81c09f2a7870c4221ad716257d024c862012776b0baf13bad79df5ee07fdb54b9d561a7"

RPROVIDES:${PN} += "vi \
vim \
vim(aarch-64) \
vim-base \
vim-enhanced \
vim-python \
vim_client"
RDEPENDS:${PN} += "/bin/sh \
alts \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libperl.so()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
perl \
vim-data-common \
xxd"

inherit rpm

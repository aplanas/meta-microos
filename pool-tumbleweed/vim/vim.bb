SUMMARY = "Vi IMproved"
DESCRIPTION = "Vim (Vi IMproved) is an almost compatible version of the UNIX editor \
vi. Almost every possible command can be performed using only ASCII \
characters. Only the 'Q' command is missing (you do not need it). Many \
new features have been added: multilevel undo, command line history, \
file name completion, block operations, and editing of binary data."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-9.0.1632-2.2.aarch64.rpm"
RPM_HASH = "577ff3c754b0ec18e885f5bca5eba47bc35b1d43472e61e86a98b9d01a88d71482cdb7899315ec5dbf0d3c1d48369b48aa654a4387f8be8e272cc6058d52b6a6"

RPROVIDES:${PN} += "vi \
vim \
vim-base \
vim-client \
vim-enhanced \
vim-python"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libm.so.6 \
libperl.so \
libselinux.so.1 \
libtinfo.so.6 \
perl \
vim-data-common \
xxd"

inherit rpm

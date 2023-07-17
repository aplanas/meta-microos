SUMMARY = "Vi IMproved"
DESCRIPTION = "Vim (Vi IMproved) is an almost compatible version of the UNIX editor \
vi. Almost every possible command can be performed using only ASCII \
characters. Only the 'Q' command is missing (you do not need it). Many \
new features have been added: multilevel undo, command line history, \
file name completion, block operations, and editing of binary data."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-9.0.1632-2.1.aarch64.rpm"
RPM_HASH = "cb78c2abcf5610c28255b8ddf0553f7045b62281d8f2b13d8feab09176f030deb133eaa04c1d19311307ecfbc073ade73759f39d7f6428e0a2db6fdc9512cab0"

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

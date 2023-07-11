SUMMARY = "Vi IMproved"
DESCRIPTION = "Vim (Vi IMproved) is an almost compatible version of the UNIX editor \
vi. Almost every possible command can be performed using only ASCII \
characters. Only the 'Q' command is missing (you do not need it). Many \
new features have been added: multilevel undo, command line history, \
file name completion, block operations, and editing of binary data."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-9.0.1632-1.1.aarch64.rpm"
RPM_HASH = "7822e7e2826979702161595a1ace54fbcbd0f3894424b25c4e4e307e06d76167c13e052da82bb3f2cafe1ec6b6f4860a548da3f5e5e822cfb7d3791fd5e6f818"

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

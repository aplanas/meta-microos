SUMMARY = "Vim-fork focused on extensibility and agility"
DESCRIPTION = "Neovim is a refactor - and sometimes redactor - in the tradition of \
Vim, which itself derives from Stevie. It is not a rewrite, but a \
continuation and extension of Vim. Many rewrites, clones, emulators \
and imitators exist; some are very clever, but none are Vim. Neovim \
strives to be a superset of Vim, notwithstanding some intentionally \
removed misfeatures; excepting those few and carefully-considered \
excisions, Neovim is Vim. It is built for users who want the good \
parts of Vim, without compromise, and more."
LICENSE = "Apache-2.0 & Vim"

PV = "0.9.1"

RPM_NAME = "neovim-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "d2cdd01c305f053491e1729cf1b928077a71704145529234129c6a6b82d6dd99780c5918fcdb1528fb4740216c5ca2f57e9c490e778ae93c42e7e2e6e5887b76"

RPROVIDES:${PN} += "config-neovim \
neovim"

RDEPENDS:${PN} += "/usr/bin/sh \
gperf \
ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libluv.so.1 \
libm.so.6 \
libmsgpackc.so.2 \
libtermkey.so.1 \
libtree-sitter.so.0 \
libunibilium.so.4 \
libuv.so.1 \
libvterm.so.0 \
libvterm0 \
lua51-bit32 \
lua51-luv \
xdg-utils"

inherit rpm

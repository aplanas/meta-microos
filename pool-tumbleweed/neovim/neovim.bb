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

PV = "0.9.2"

RPM_NAME = "neovim-0.9.2-1.1.aarch64.rpm"
RPM_HASH = "aa031aa95c43c45ac9f09ecb5f7b02d366adf0626cc9a4b36f3b96dc646a7a2036766da7ccac8a6bdd0fc96316ed9093f44ee3f58248930a5f84512c3cef6162"

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

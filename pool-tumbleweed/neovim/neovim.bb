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

PV = "0.9.0"

RPM_NAME = "neovim-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "48aabc2feb03b5b785d74e37a56e339f6b4e3d443e5776b836619fe3846a27e6c2d6201a78b1e9b9393c46778c5afd7614e5ec3de49d2600b6ab028772feffdb"

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

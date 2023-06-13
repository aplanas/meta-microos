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

RPROVIDES:${PN} += "application() \
application(nvim.desktop) \
config(neovim) \
mimehandler(application/x-shellscript) \
mimehandler(text/english) \
mimehandler(text/plain) \
mimehandler(text/x-c) \
mimehandler(text/x-c++) \
mimehandler(text/x-c++hdr) \
mimehandler(text/x-c++src) \
mimehandler(text/x-chdr) \
mimehandler(text/x-csrc) \
mimehandler(text/x-java) \
mimehandler(text/x-makefile) \
mimehandler(text/x-moc) \
mimehandler(text/x-pascal) \
mimehandler(text/x-tcl) \
mimehandler(text/x-tex) \
neovim \
neovim(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gperf \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libluajit-5.1.so.2()(64bit) \
libluv.so.1()(64bit) \
libm.so.6()(64bit) \
libmsgpackc.so.2()(64bit) \
libtermkey.so.1()(64bit) \
libtree-sitter.so.0()(64bit) \
libunibilium.so.4()(64bit) \
libuv.so.1()(64bit) \
libvterm.so.0()(64bit) \
libvterm0 \
lua51-bit32 \
lua51-luv \
xdg-utils"

inherit rpm

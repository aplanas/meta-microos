SUMMARY = "Implements some of TextMate's snippets features in Vim"
DESCRIPTION = "snipMate aims to be an unobtrusive, concise vim script that implements some of \
TextMate's snippets features in Vim. A snippet is a piece of often-typed text \
that you can insert into your document using a trigger word followed by a \
<tab>. \
 \
For instance, in a C file using the default installation of snipMate.vim, if \
you type 'for<tab>' in insert mode, it will expand a typical for loop in C: \
 \
for (i = 0; i < count; i++) { \
}"
LICENSE = "MIT"

PV = "0.83"

RPM_NAME = "vim-plugin-snipmate-0.83-55.1.noarch.rpm"
RPM_HASH = "9d398a40ed6f3d31af459e8029a1eeed159df2ed098f72bfe623ed3f7992bef5f5d6277853e3fa851dd2c5bd7f11627d256cf7a6c1b67ce137a43dc9fe93bebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-snipmate"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

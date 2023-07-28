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

RPM_NAME = "vim-plugin-snipmate-0.83-56.1.noarch.rpm"
RPM_HASH = "961667f24a31589fcd5a0048f1616026c210eeda975451bc89bc221bf07266d7bab63ea7b5e1263511919caff1ae8f9334da3b94f2f6e786859c824df4933743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-snipmate"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

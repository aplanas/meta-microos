SUMMARY = "Source code browser with support for many languages"
DESCRIPTION = "The 'Tag List' plugin is a source code browser plugin for Vim and provides an \
overview of the structure of source code files and allows you to efficiently \
browse through source code files for different programming languages."
LICENSE = "ISC"

PV = "4.6"

RPM_NAME = "vim-plugin-taglist-4.6-55.1.noarch.rpm"
RPM_HASH = "4565330c59fcf8a5d1429e7caedcd78a99928c26fb23ec9c19370e9290b48175cca35f725d3c1058a707c8315487399492350999e5853ebf3274adcb3e35f47c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-taglist"

RDEPENDS:${PN} += "/bin/sh \
ctags \
vim"

inherit rpm

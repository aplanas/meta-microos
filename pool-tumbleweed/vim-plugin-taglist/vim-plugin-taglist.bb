SUMMARY = "Source code browser with support for many languages"
DESCRIPTION = "The 'Tag List' plugin is a source code browser plugin for Vim and provides an \
overview of the structure of source code files and allows you to efficiently \
browse through source code files for different programming languages."
LICENSE = "ISC"

PV = "4.6"

RPM_NAME = "vim-plugin-taglist-4.6-56.1.noarch.rpm"
RPM_HASH = "224fcf50421f6f5291fb6f9969130ba610b4760df596441b859e44d6dd12c29375ffbd557a38b48a9eae7533965329b6238e900380e173004ec92557b97f8ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-taglist"

RDEPENDS:${PN} += "/usr/bin/sh \
ctags \
vim"

inherit rpm

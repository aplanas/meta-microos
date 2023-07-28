SUMMARY = "A plugin that allows for easy commenting of code for many filetypes"
DESCRIPTION = "The NERD commenter provides many different commenting operations and styles \
which may be invoked via key mappings and a commenting menu. These operations \
are available for most filetypes."
LICENSE = "WTFPL"

PV = "2.7.0"

RPM_NAME = "vim-plugin-NERDcommenter-2.7.0-56.1.noarch.rpm"
RPM_HASH = "1a5bb3d70c21719319373ea7c1dd2f5a73e42d1ce1628321cd66edaa9da71c9ec99b4dd05817c0e4625a99cfb72a45d480b7997791440b42bf451df687df5593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-NERDcommenter"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

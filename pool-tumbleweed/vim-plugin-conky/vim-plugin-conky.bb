SUMMARY = "Conky Configuration File Support for Vim"
DESCRIPTION = "Conky is an configurable system monitor for X. \
 \
This package provides syntax highlighting support for conky \
configuration files in vim."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.13.1"

RPM_NAME = "vim-plugin-conky-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "f1cecd95e398aeff56eb3b8d4205d1963f396e935b008b32e9ef63a1e7723c73bbb1c81c86313f61ba87427c9432dae0d0a36bed7a52cf9820d43884510760ab"

RPROVIDES:${PN} += "conky-vim \
vim-plugin-conky \
vim-plugin-conky(aarch-64)"
RDEPENDS:${PN} += "vim-base"

inherit rpm

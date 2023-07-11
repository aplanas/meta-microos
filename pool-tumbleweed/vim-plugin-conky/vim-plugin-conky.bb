SUMMARY = "Conky Configuration File Support for Vim"
DESCRIPTION = "Conky is an configurable system monitor for X. \
 \
This package provides syntax highlighting support for conky \
configuration files in vim."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.13.1"

RPM_NAME = "vim-plugin-conky-1.13.1-3.3.aarch64.rpm"
RPM_HASH = "8e98c1ca5a2f1809e288168e04f1b7732bc7b2a268d87d919a0bcbde4e17062b994995216927349d3153f2d90f937d37ecefab02ffdd2e0a33fc95bd67ea0e1e"

RPROVIDES:${PN} += "conky-vim \
vim-plugin-conky"

RDEPENDS:${PN} += "vim-base"

inherit rpm

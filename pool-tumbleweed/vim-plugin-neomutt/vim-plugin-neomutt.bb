SUMMARY = "Neomutt plugin for Vim"
DESCRIPTION = "This plugin provides syntax for the neomutt configuration file. In addition, it \
sets the mail filetype to temporary mail files created by neomutt when writing \
or editing emails."
LICENSE = "Vim"

PV = "20220612"

RPM_NAME = "vim-plugin-neomutt-20220612-55.1.noarch.rpm"
RPM_HASH = "7d1704bd47dcbb5ffed5916903af021f5e16b516283c7c83d0f2b596ab5aa3c39a4d5804564efe5804dfa8251b0602531ef40649c797b28cc60b45f1a2688d5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-neomutt"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

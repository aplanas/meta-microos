SUMMARY = "Neomutt plugin for Vim"
DESCRIPTION = "This plugin provides syntax for the neomutt configuration file. In addition, it \
sets the mail filetype to temporary mail files created by neomutt when writing \
or editing emails."
LICENSE = "Vim"

PV = "20220612"

RPM_NAME = "vim-plugin-neomutt-20220612-56.1.noarch.rpm"
RPM_HASH = "4e71d39f61efbaa6f8cb530ac8083f40a4c90d7281926ba440a00801cfa066053346d99e7aa95dcbaf44c32efa57d56bd538b39da37de73973a3f857b77e87cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-neomutt"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

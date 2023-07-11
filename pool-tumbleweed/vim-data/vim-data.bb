SUMMARY = "Data files needed for extended vim functionality"
DESCRIPTION = "This package contains optional runtime & syntax files for vim."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-data-9.0.1632-1.1.noarch.rpm"
RPM_HASH = "37b6666a1fda544b5d3e29c33089ac640ea21d22e37cbce6ec3723516c7bc065a4db3037cd24bfdf8bc92c7dbe94dd9a7b86b82e85919e82ed1c7830fe65b989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data \
vim-plugin-matchit \
vim-plugin-nginx"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
vim-data-common"

inherit rpm

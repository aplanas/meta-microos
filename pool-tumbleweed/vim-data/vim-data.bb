SUMMARY = "Data files needed for extended vim functionality"
DESCRIPTION = "This package contains optional runtime & syntax files for vim."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-data-9.0.1632-2.2.noarch.rpm"
RPM_HASH = "55e4928600e149168bffcd4bd14c075a3f8855828fc401fd122d0f54550dd46e006cf579088d051d649c7bb931314ea2a98485108ef56abbc5068e66da4551d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data \
vim-plugin-matchit \
vim-plugin-nginx"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
vim-data-common"

inherit rpm

SUMMARY = "Data files needed for extended vim functionality"
DESCRIPTION = "This package contains optional runtime & syntax files for vim."
LICENSE = "Vim"

PV = "9.0.1632"

RPM_NAME = "vim-data-9.0.1632-2.1.noarch.rpm"
RPM_HASH = "0401eac02f52f643c634d84b956e7ba28b99d59f60f6f7a44cca56a7d76c78557f5f363768c0f3c112ff42e07e254f76fb850e22d38a264fd93efa6c6c88229d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data \
vim-plugin-matchit \
vim-plugin-nginx"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
vim-data-common"

inherit rpm

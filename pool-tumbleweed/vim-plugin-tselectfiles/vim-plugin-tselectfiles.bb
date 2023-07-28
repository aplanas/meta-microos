SUMMARY = "A quick file selector/browser/explorer"
DESCRIPTION = "This plugin provides a simple file browser. It is not a full blown explorer but \
can be nevertheless be useful for quickly selecting a few files or renaming \
them."
LICENSE = "GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "vim-plugin-tselectfiles-0.11-56.1.noarch.rpm"
RPM_HASH = "7518f8bf7c74cc6c1cf0f5a7babe7655cb87eed5d119b11b7ebc281d79ae36272c1f1b1419649f65bf6f05880e794fecedad18b9a40579ab1e6005ca4e6478f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tselectfiles"

RDEPENDS:${PN} += "/usr/bin/sh \
vim \
vim-plugin-tlib"

inherit rpm

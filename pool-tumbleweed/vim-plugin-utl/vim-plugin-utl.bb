SUMMARY = "Universal text linking for vim"
DESCRIPTION = "Universal text link allows you to set hyperlinks within your text documents. \
Hyperlinks can be used to start applications, open related documents, or \
bookmark parts of your text document."
LICENSE = "GPL-1.0-or-later"

PV = "2.0"

RPM_NAME = "vim-plugin-utl-2.0-56.1.noarch.rpm"
RPM_HASH = "8adcce4082a3c00e68b6c4eaee792ca15cbad5eb9404f39c28b41a955e6af7d38b00b4bccb89188021093985954d0e4f4bda4666aa7a0084a4788046af1fa71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-utl"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

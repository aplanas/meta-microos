SUMMARY = "Utility functions for vim"
DESCRIPTION = "This library provides some utility functions. There isn't much need to install \
it unless another plugin requires you to do so."
LICENSE = "GPL-1.0-or-later"

PV = "1.28"

RPM_NAME = "vim-plugin-tlib-1.28-55.1.noarch.rpm"
RPM_HASH = "0bfee940f1aba6cf3b7e6463348d24a97b1afdda8f804e2a87448c74253d3a93edd59a5d1b7fd0aa04f0b37886c6e8a70afbd6f8763a2f8974475d3c2ee723b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tlib"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

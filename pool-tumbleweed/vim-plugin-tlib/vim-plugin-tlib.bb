SUMMARY = "Utility functions for vim"
DESCRIPTION = "This library provides some utility functions. There isn't much need to install \
it unless another plugin requires you to do so."
LICENSE = "GPL-1.0-or-later"

PV = "1.28"

RPM_NAME = "vim-plugin-tlib-1.28-56.1.noarch.rpm"
RPM_HASH = "76c6fe05a05a66885a66e684d5615cedd085899e58c7b703c1e78f81204cbe15c7b9e6856ca08649b53bca2f5df6097be1ae75e5abb300fec5435f805fe00c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tlib"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm

SUMMARY = "Quilt support for vim"
DESCRIPTION = "Vim plugin that helps with quilt operations from inside vim."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "vim-plugin-quilt-0.9.7-55.1.noarch.rpm"
RPM_HASH = "314f892d209f11a04019658a545947c2d149583c327d1b5cfba4fb07ac869a69bea025cdf58eb4b95addca6d52d5c9e120de12281de70bb3e79861b0c8282fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-quilt"
RDEPENDS:${PN} += "/bin/sh \
quilt \
vim"

inherit rpm

SUMMARY = "Quilt support for vim"
DESCRIPTION = "Vim plugin that helps with quilt operations from inside vim."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "vim-plugin-quilt-0.9.7-56.1.noarch.rpm"
RPM_HASH = "94c8faef70a9b6167431265ed48254f2f469a7f89516c0d397c85e274bbdbe1eaab8a9bd083aa8dd4693182fe75950a37fddfe3622183e9da54b9f7d4802b210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-quilt"

RDEPENDS:${PN} += "/usr/bin/sh \
quilt \
vim"

inherit rpm

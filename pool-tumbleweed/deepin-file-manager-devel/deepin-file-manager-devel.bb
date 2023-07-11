SUMMARY = "Development package for Deepin File Manager"
DESCRIPTION = "Header files and libraries for Deepin File Manager."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-devel-5.6.4-3.9.aarch64.rpm"
RPM_HASH = "0d4d06450b7135f94097e7b6f0a5af4559035bd5ad2b0a3b9d388f04dd7a45aa4b6dd7d778c15f1a10868d6ba3fc0e6da7e8611ec6d5d7abafcf7eee97a124f8"

RPROVIDES:${PN} += "deepin-file-manager-devel \
pkgconfig-dde-file-manager \
pkgconfig-dfm-extension"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdde-file-manager5"

inherit rpm

SUMMARY = "Development package for Deepin File Manager"
DESCRIPTION = "Header files and libraries for Deepin File Manager."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-devel-5.6.4-3.7.aarch64.rpm"
RPM_HASH = "43ee25131cd66a4aeedae5c130dfed9b6a8f5a5166c578ac1007139b81b312f8043f557c76ca4dad40238660d07b8768231649d7eac7b2cb886d7ead230e7224"

RPROVIDES:${PN} += "deepin-file-manager-devel \
pkgconfig-dde-file-manager \
pkgconfig-dfm-extension"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdde-file-manager5"

inherit rpm

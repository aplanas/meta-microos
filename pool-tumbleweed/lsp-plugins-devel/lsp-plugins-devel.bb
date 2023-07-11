SUMMARY = "Linux Studio Plugins Development files"
DESCRIPTION = " \
Development files for Linux Studio Plugins"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lsp-plugins-devel-1.2.7-1.2.aarch64.rpm"
RPM_HASH = "d936d149c1b060c65a78a822f93be2cdf553afb74c6b9837a0dc49c9e2c1816a7edbab895daced9d95ef7ebd8b5d5e3e2c4c2b8d45edfd7ce98f443d15c2c4c5"

RPROVIDES:${PN} += "lsp-plugins-devel \
pkgconfig-lsp-r3d-glx-lib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lsp-plugins-common"

inherit rpm

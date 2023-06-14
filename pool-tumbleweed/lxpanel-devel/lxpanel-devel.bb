SUMMARY = "Devel files for lxpanel"
DESCRIPTION = "Headers and development files for lxpanel."
LICENSE = "GPL-2.0-only"

PV = "0.10.1"

RPM_NAME = "lxpanel-devel-0.10.1-1.11.aarch64.rpm"
RPM_HASH = "fc2a323517f9391670d9e6517775826d943e91f5706af5982c97093962587668bb289ffaf783a3bbf72db9066ee38217e7dcce811b13f1809b5f5e4a43e4c894"

RPROVIDES:${PN} += "lxpanel-devel \
pkgconfig-lxpanel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
liblxpanel0 \
lxpanel \
menu-cache-devel \
pkgconfig \
pkgconfig-gtk+-2.0 \
pkgconfig-libfm"

inherit rpm

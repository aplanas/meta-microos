SUMMARY = "Touch frame library development files"
DESCRIPTION = "This package provides the tree that handles the buildup and \
synchronisation of a set of simultaneous touches. \
 \
This package includes the development files for frame."
LICENSE = "LGPL-3.0-only & GPL-3.0-only"

PV = "2.5.0+bzr20160809"

RPM_NAME = "frame-devel-2.5.0+bzr20160809-2.11.aarch64.rpm"
RPM_HASH = "55b310e192828799fe9f05b1eeaf14dc4f6f50dae6a78f94420cf782602d801fdf8e1d9c29c69083ff444d561ed6cbf1fe1646138485352303b37b4633006e5b"

RPROVIDES:${PN} += "frame-devel \
frame-devel(aarch-64) \
pkgconfig(frame) \
pkgconfig(frame-x11)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
frame \
libframe6"

inherit rpm

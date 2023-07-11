SUMMARY = "Development files for libvsgpt"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsgpt."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt-devel-20221029-3.9.aarch64.rpm"
RPM_HASH = "39cc0c896b346e90b50746fb8b331bcff44e5dc4f6624060ecddaeebd6230150d6045ec5896f9cd06059f4a6aed23d93da4d4cea9132d38b78714e802ed082e2"

RPROVIDES:${PN} += "libvsgpt-devel \
pkgconfig-libvsgpt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsgpt1"

inherit rpm

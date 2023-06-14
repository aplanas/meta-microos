SUMMARY = "Development files for libsysfs"
DESCRIPTION = "Libsysfs's purpose is to provide a library for interfacing with the \
kernel's sys filesystem mounted at /sys. The library was an attempt to \
create a stable interface to sysfs, but it failed. It is still provided \
for the current users, but no new software should use this library. \
 \
This package contains the development files for libsysfs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.1"

RPM_NAME = "sysfsutils-devel-2.1.1-1.8.aarch64.rpm"
RPM_HASH = "d56a5d5a1578997ccdfa0e3951f7c03f12d9ca4610a2c5cbe636e8f9b8d376fa52bc126e597d6528cb9d23675b646383fa826289739f522da69d78c0272afba3"

RPROVIDES:${PN} += "pkgconfig-libsysfs \
sysfsutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsysfs2"

inherit rpm

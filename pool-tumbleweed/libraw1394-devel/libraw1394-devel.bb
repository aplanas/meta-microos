SUMMARY = "Development files for libraw1394"
DESCRIPTION = "libraw1394 provides direct access to the connected 1394 buses to \
userspace. Through this library, applications can directly send to \
and receive from other nodes without requiring a kernel driver for \
the protocol in question. \
 \
This subpackage contains the library links and headers for \
libraw1394."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "libraw1394-devel-2.1.2-1.12.aarch64.rpm"
RPM_HASH = "2ed3028a6d3812e9ae6a21df87a3a9a1280d9a4a537eb64295ea92f12d305f6cd206b434b616be53587a82fdab4e697fa815817dfff5e4513840c882f401a5f0"

RPROVIDES:${PN} += "libraw1394-devel \
pkgconfig-libraw1394"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libraw1394-11"

inherit rpm

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

RPM_NAME = "libraw1394-devel-2.1.2-1.11.aarch64.rpm"
RPM_HASH = "f774bd33c51c545717552fbfb79f8f91791724f0b34f6c0e256946991db2b2aa5f5223de4840137b0f2e980c3eac7177f219c85893dfccec8c25fbc90321c528"

RPROVIDES:${PN} += "libraw1394-devel \
libraw1394-devel(aarch-64) \
pkgconfig(libraw1394)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libraw1394-11"

inherit rpm

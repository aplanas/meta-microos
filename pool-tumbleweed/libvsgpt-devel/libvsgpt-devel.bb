SUMMARY = "Development files for libvsgpt"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsgpt."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt-devel-20221029-3.7.aarch64.rpm"
RPM_HASH = "fed0d74a2b9efe46fee2688af14df5f1cd5783251958470d251073707317e6f0dded9831b6de9c8e170b6d4ebacdb7c1cfad58ba9bbaecad771b7b84021bb67c"

RPROVIDES:${PN} += "libvsgpt-devel \
pkgconfig-libvsgpt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsgpt1"

inherit rpm

SUMMARY = "Development files for libvsgpt"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsgpt."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt-devel-20221029-4.1.aarch64.rpm"
RPM_HASH = "2fbfb24db22250c0e490bd0fa4be97fd860ea267c13228ef48da765271e203f7d3dfb9e38749dac16a9700a8e74eb96ec713860a0fb613d5ea69c4a08e521ee7"

RPROVIDES:${PN} += "libvsgpt-devel \
pkgconfig-libvsgpt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsgpt1"

inherit rpm

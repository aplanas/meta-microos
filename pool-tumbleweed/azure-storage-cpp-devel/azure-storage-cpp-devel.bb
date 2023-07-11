SUMMARY = "Devel files for Azure storage services"
DESCRIPTION = "Development files for working with Microsoft Azure storage services"
LICENSE = "Apache-2.0"

PV = "7.5.0"

RPM_NAME = "azure-storage-cpp-devel-7.5.0-1.17.aarch64.rpm"
RPM_HASH = "41c519e3d299e0676063d3188d1421bf49c50531fde4188bf1f58c9c80c80e2d15eaefb2d7ef171e209303df023b99b1a28bf08149df4c27c041dc786e0affe9"

RPROVIDES:${PN} += "azure-storage-cpp-devel"

RDEPENDS:${PN} += "libazurestorage7 \
libboost-chrono-devel \
libboost-date-time-devel \
libboost-filesystem-devel \
libboost-locale-devel \
libboost-log-devel \
libboost-random-devel \
libboost-regex-devel \
libboost-thread-devel \
pkgconfig-cpprest \
pkgconfig-libssl \
pkgconfig-libxml-2.0 \
pkgconfig-uuid"

inherit rpm

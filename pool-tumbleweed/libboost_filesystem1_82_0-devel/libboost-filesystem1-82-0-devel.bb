SUMMARY = "Development headers for Boost.Filesystem library"
DESCRIPTION = "Development headers for Boost.Filesystem library, a library providing \
facilities to manipulate files and directories, and the paths that \
identify them."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_filesystem1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "809b8c4f861ccbfa81cafce083d9a8ea6e7ce5c899eb0e5ee88e88e53c07fdd3d1a2333ea1e7c37cb82a85bdb10aef820f568b64b8881509a4fb60d63f7124e5"

RPROVIDES:${PN} += "libboost_filesystem-devel-impl \
libboost_filesystem1_82_0-devel \
libboost_filesystem1_82_0-devel(aarch-64)"

RDEPENDS:${PN} += "libboost_atomic1_82_0-devel \
libboost_filesystem1_82_0 \
libboost_headers1_82_0-devel \
libstdc++-devel"

inherit rpm

SUMMARY = "Devel files for czmq"
DESCRIPTION = "CZMQ is a higher-level binding for the ZeroMQ core API. \
 \
This subpackage contains libraries, header files, and pkgconfig and \
cmake descriptions for developing applications that want to make use \
of CZMQ."
LICENSE = "MPL-2.0"

PV = "4.2.1"

RPM_NAME = "czmq-devel-4.2.1-1.9.aarch64.rpm"
RPM_HASH = "e923537229517bd15333c741eb4243a298090b1a19dafed31ef5aa28b0d95b370f8d0ee15e26d0711d3d25dc77001203a99e461e423e833417f22f27ffd70cc7"

RPROVIDES:${PN} += "czmq-devel \
pkgconfig-libczmq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libczmq4 \
pkgconfig-libcurl \
pkgconfig-liblz4 \
pkgconfig-libmicrohttpd \
pkgconfig-libsystemd \
pkgconfig-libzmq \
pkgconfig-nss \
pkgconfig-uuid \
systemd-devel"

inherit rpm

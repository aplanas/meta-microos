SUMMARY = "Devel files for czmq"
DESCRIPTION = "CZMQ is a higher-level binding for the ZeroMQ core API. \
 \
This subpackage contains libraries, header files, and pkgconfig and \
cmake descriptions for developing applications that want to make use \
of CZMQ."
LICENSE = "MPL-2.0"

PV = "4.2.1"

RPM_NAME = "czmq-devel-4.2.1-1.8.aarch64.rpm"
RPM_HASH = "a3b4d95cafbd897a98592eec1c537e8f0b4260ecd55c0ac0d5b9b662b95af99c6fb0d4415234eb1debfafc5fe790f4e7251745e11858b466c955fd65969110c3"

RPROVIDES:${PN} += "czmq-devel \
czmq-devel(aarch-64) \
pkgconfig(libczmq)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libczmq4 \
pkgconfig(libcurl) \
pkgconfig(liblz4) \
pkgconfig(libmicrohttpd) \
pkgconfig(libsystemd) \
pkgconfig(libzmq) \
pkgconfig(nss) \
pkgconfig(uuid) \
systemd-devel"

inherit rpm

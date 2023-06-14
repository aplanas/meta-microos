SUMMARY = "Development headers for libmsgpack C++ library"
DESCRIPTION = "MessagePack is a binary-based object serialization library. It enables to \
exchange structured objects between many languages like JSON. \
 \
This package provides C++ headers and other devel files."
LICENSE = "BSL-1.0"

PV = "4.1.3"

RPM_NAME = "msgpack-cxx-devel-4.1.3-1.3.aarch64.rpm"
RPM_HASH = "1d5646ca0ec65f60987ed1849a5e74ec9c4661c504ca905fdbbf496ab04a824ab13da2933407cfe19ea9b232b13177b5c8661a1220a213993c01af12f820b7ca"

RPROVIDES:${PN} += "cmake-msgpack \
libmsgpack-devel \
msgpack-cxx-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
msgpack-c-devel"

inherit rpm

SUMMARY = "Development headers for libmsgpack C library"
DESCRIPTION = "MessagePack is a binary-based object serialization library. It enables to \
exchange structured objects between many languages like JSON. \
 \
This package provides headers and other devel files."
LICENSE = "BSL-1.0"

PV = "4.0.0"

RPM_NAME = "msgpack-c-devel-4.0.0-1.4.aarch64.rpm"
RPM_HASH = "6cf904a08e3d7ae20349bea0564cad51be1883612014aa8df78ba4f549d1632f23747e5545b16b76fe27f959fd62946078950604b3012e1b486228e9ecc889a8"

RPROVIDES:${PN} += "cmake-msgpack \
libmsgpack-devel \
libmsgpackc-devel \
msgpack-c-devel \
pkgconfig-msgpack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmsgpackc2"

inherit rpm

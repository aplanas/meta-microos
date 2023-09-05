SUMMARY = "Dynamic menu library inspired by dmenu"
DESCRIPTION = "Library for Bemenu, dynamic menu inspired by dmenu."
LICENSE = "MIT"

PV = "0.6.16"

RPM_NAME = "libbemenu0-0.6.16-1.1.aarch64.rpm"
RPM_HASH = "703277c3bfe0f7c81a459a054ac3b0aa14f1fa45b9356459a97a7cd3fb57e4add7a6ffa2d14e0a51363d677ae0185096127d65f687bf807306dde101332674d2"

RPROVIDES:${PN} += "libbemenu.so.0 \
libbemenu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
bemenu \
libc.so.6"

inherit rpm

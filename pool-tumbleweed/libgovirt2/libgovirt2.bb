SUMMARY = "GObject based oVirt bindings"
DESCRIPTION = "GoVirt is a GObject wrapper for the oVirt REST API [1]. It will \
only provide very basic functionality as the goal is to \
autogenerate a full wrapper as it is already done for the python \
bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.9"

RPM_NAME = "libgovirt2-0.3.9-1.3.aarch64.rpm"
RPM_HASH = "c769a56d54329cd6ceb8374d32581d186e56ef887187f3050baa169b4bd83ed9d5f35e16ca5eaa1f14d9da9a9ed72349c4245adacf7836b1cb97a6c0ad6fbeb9"

RPROVIDES:${PN} += "libgovirt \
libgovirt.so.2 \
libgovirt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librest-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm

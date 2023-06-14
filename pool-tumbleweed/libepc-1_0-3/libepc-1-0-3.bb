SUMMARY = "Easy Publish and Consume Library"
DESCRIPTION = "The Easy Publish and Consume library provides methods to publish \
data via HTTPS, announce data via DNS-SD, re-find and consume this \
data. \
 \
This library can be used as a key/value store published to the \
network, using encryption, authentication and service discovery."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.6"

RPM_NAME = "libepc-1_0-3-0.4.6-6.6.aarch64.rpm"
RPM_HASH = "c221f652aae142137c5c17c7aacc33d26f912b03d74a178693e4e62d4fbc275b1e5986ca948635db1f48b1f25df084ce150ac9c52147cbfe56678ec880f8a004"

RPROVIDES:${PN} += "libepc \
libepc-1-0-3 \
libepc-1.0.so.3 \
libepc-ui-1.0.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsoup-2.4.so.1 \
libuuid.so.1"

inherit rpm

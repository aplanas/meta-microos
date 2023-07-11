SUMMARY = "Library to parse flash media stream URLs"
DESCRIPTION = "libquvi is a cross-platform library for parsing flash media stream \
URLs with C API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "libquvi-0_9-0_9_4-0.9.4-7.7.aarch64.rpm"
RPM_HASH = "2acdcb6a42087e21835e78160b4d3debbbb030629755929b4312447fa89dcf8c8a103bb8d75a26103659b79f6355c8c7bfa09904f1c20fc08261b0805fa66049"

RPROVIDES:${PN} += "libquvi \
libquvi-0-9-0-9-4 \
libquvi-0.9-0.9.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgpg-error.so.0 \
liblua5.4.so.5 \
libproxy.so.1"

inherit rpm

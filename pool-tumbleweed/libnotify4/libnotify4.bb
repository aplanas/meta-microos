SUMMARY = "Notifications Library"
DESCRIPTION = "D-BUS notifications library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libnotify4-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "3b469ffa396d68abcfe5a7c781d387e0fe3b7db0732a28bf4ceed1e51acb611ffe7f4c57420a89acc578ff269580a697ec0e72e253b6aeac31a24735bcf2dca1"

RPROVIDES:${PN} += "libnotify.so.4 \
libnotify4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

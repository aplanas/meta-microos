SUMMARY = "Support for appstreamcli compose"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support to appstreamcli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "AppStream-compose-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "92efc5079afb6a01a6cbfafce945378db6e0e461da164f08f26b3c339d27cf723fca9c5dc846dc58efcaea57ea7607553271c6f0e8023a948250e3385bfdc612"

RPROVIDES:${PN} += "AppStream-compose"

RDEPENDS:${PN} += "AppStream \
gdk-pixbuf-loader-rsvg \
ld-linux-aarch64.so.1 \
libappstream-compose.so.0 \
libappstream.so.4 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

SUMMARY = "Support for appstreamcli compose"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support to appstreamcli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "AppStream-compose-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "13683bdb3eb5887b8a5aa1bdb12fead8f2891c3a2bd3b91f288d41c1b21ea9371eb0e5971ab0e159983e26a706870ce06bddefafcea21b9324f89564a8c6d0a8"

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

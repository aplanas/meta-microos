SUMMARY = "Support for appstreamcli compose"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support to appstreamcli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.2"

RPM_NAME = "AppStream-compose-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "8f8fe500c4ebf140a24348a11314fc92a89469187420ab822e3b074ba162375424460ed830db8dfbd5978e3effb641fc1796ad34813f96b0fb4a26cf0683b7ae"

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

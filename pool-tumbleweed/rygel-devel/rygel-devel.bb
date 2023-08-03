SUMMARY = "Development files for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides development files for rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "rygel-devel-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "cd28cecbd50b5ba17e2b60b0d202c17386973662a6aa6a839008feae6f4e5ea43c9b132fc6cff170c224cbb04073a92b19f7d625063ccd54096c4bf0ba29df6e"

RPROVIDES:${PN} += "pkgconfig-rygel-core-2.8 \
pkgconfig-rygel-renderer-2.8 \
pkgconfig-rygel-renderer-gst-2.8 \
pkgconfig-rygel-ruih-2.8 \
pkgconfig-rygel-server-2.8 \
rygel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librygel-core-2-8-0 \
librygel-db-2-8-0 \
librygel-renderer-2-8-0 \
librygel-renderer-gst-2-8-0 \
librygel-ruih-2-8-0 \
librygel-server-2-8-0 \
pkgconfig-gee-0.8 \
pkgconfig-gmodule-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gupnp-av-1.0 \
pkgconfig-rygel-core-2.8 \
rygel \
typelib-1-0-RygelCore-2-8 \
typelib-1-0-RygelRenderer-2-8 \
typelib-1-0-RygelRendererGst-2-8 \
typelib-1-0-RygelServer-2-8"

inherit rpm

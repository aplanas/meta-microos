SUMMARY = "Development files for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides development files for rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "rygel-devel-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "0c9d18840d24450aa409d77a9d5e13a7e0cf28838706c1b2fd60de256f75a21ffc454b5131ad9e9610f039ca95f7c7f85798b49c5a0df4dd276dbbe9949433af"

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

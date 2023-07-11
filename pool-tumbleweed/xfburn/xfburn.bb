SUMMARY = "Simple CD/DVD Burning Application"
DESCRIPTION = "Xfburn is a simple CD/DVD burning application based on the libburnia libraries. \
It can blank CD-RWs, burn and create iso images, as well as burn personal \
compositions of data to either CD or DVD."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "xfburn-0.7.0-1.4.aarch64.rpm"
RPM_HASH = "c8e1e74cab208fa1b05748e1b5f39c616500fad6f2cbd910d24485af30b6eeb74e9fc36855eea72d7dba9474795983150d4ad9074e52e61d9789a366acee15af"

RPROVIDES:${PN} += "xfburn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libburn.so.4 \
libc.so.6 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libisofs.so.6 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm

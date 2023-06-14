SUMMARY = "Simple CD/DVD Burning Application"
DESCRIPTION = "Xfburn is a simple CD/DVD burning application based on the libburnia libraries. \
It can blank CD-RWs, burn and create iso images, as well as burn personal \
compositions of data to either CD or DVD."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "xfburn-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "b4f08eebeac79e3a432e951a1adc451de99ba628c6509cdb51a8ff903c10ca04dd1d4c6a8a90b6067b6e7f3c10e38a00bcfb1accfbe14730c770153432646337"

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

SUMMARY = "Core library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the core library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-core-2_8-0-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "de9109969995488851a90ed37af5cb279f2d50895cdb06d8080389ddc8852e7e38bcb4493be69b88e195b96bb81c90ff9c3ef41b163c223990482871588f90e7"

RPROVIDES:${PN} += "librygel-core-2-8-0 \
librygel-core-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgupnp-1.6.so.0 \
libxml2.so.2"

inherit rpm

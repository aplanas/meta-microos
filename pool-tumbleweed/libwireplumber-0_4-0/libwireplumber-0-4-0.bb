SUMMARY = "Session / policy manager implementation for PipeWire"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package provides the wireplumber shared library."
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "libwireplumber-0_4-0-0.4.14-2.1.aarch64.rpm"
RPM_HASH = "0cca3d760c5513407d426f48869ba328ba115a920bbe18abdf722894476f2da35175f4285d0ec245195bd3e9681d954efd6ef2934a2e23b85400e3c598b7c173"

RPROVIDES:${PN} += "libwireplumber-0-4-0 \
libwireplumber-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libpipewire-0.3.so.0"

inherit rpm

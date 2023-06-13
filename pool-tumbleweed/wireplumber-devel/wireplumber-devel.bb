SUMMARY = "Session / policy manager implementation for PipeWire"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package provides all the necessary files for development with WirePlumber"
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "wireplumber-devel-0.4.14-2.1.aarch64.rpm"
RPM_HASH = "98685219789265b93032408da7e859d1baeea0f56fc975f7551af230d9f2996f597079a074f55833c73a8cec1dc3e60cc24df087c20f7d3fe93f7a7cf87c18b9"

RPROVIDES:${PN} += "pkgconfig(wireplumber-0.4) \
wireplumber-devel \
wireplumber-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwireplumber-0_4-0 \
pkgconfig(gio-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libpipewire-0.3) \
wireplumber"

inherit rpm

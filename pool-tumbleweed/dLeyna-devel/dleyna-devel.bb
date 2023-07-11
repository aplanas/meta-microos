SUMMARY = "Development files for the dLeyna libraries"
DESCRIPTION = "dleyna is a library of utility functions that are used by the \
higher level dLeyna libraries that communicate with DLNA devices, \
e.g., dleyna-server. \
 \
In brief, it provides APIs for logging, error, settings and task \
management and an IPC abstraction API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "dLeyna-devel-0.8.2-2.4.aarch64.rpm"
RPM_HASH = "1e05da4b092bda2ff6638fc30da205b0ff3330c544fd04f393b9c0862813e97648cce0100aac99e63c14c905f7ddca4f267174b74fd752db033defd1447376ec"

RPROVIDES:${PN} += "dLeyna-devel \
dleyna-core-devel \
dleyna-renderer-devel \
dleyna-server-devel \
pkgconfig-dleyna-core-1.0 \
pkgconfig-dleyna-renderer-service-1.0 \
pkgconfig-dleyna-server-service-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dLeyna \
pkgconfig-dleyna-core-1.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gupnp-1.6 \
pkgconfig-gupnp-av-1.0 \
pkgconfig-gupnp-dlna-2.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0"

inherit rpm

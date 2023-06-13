SUMMARY = "Development files for the dLeyna libraries"
DESCRIPTION = "dleyna is a library of utility functions that are used by the \
higher level dLeyna libraries that communicate with DLNA devices, \
e.g., dleyna-server. \
 \
In brief, it provides APIs for logging, error, settings and task \
management and an IPC abstraction API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "dLeyna-devel-0.8.2-2.3.aarch64.rpm"
RPM_HASH = "a607a2c43e390b0ad9d26717e809a27966526a1e62783dafe1f7f44985d1d167f7c3805bd66049d969ac77c8cc3f1924ac3370501cfd0cae1fc30275b9ba828c"

RPROVIDES:${PN} += "dLeyna-devel \
dLeyna-devel(aarch-64) \
dleyna-core-devel \
dleyna-renderer-devel \
dleyna-server-devel \
pkgconfig(dleyna-core-1.0) \
pkgconfig(dleyna-renderer-service-1.0) \
pkgconfig(dleyna-server-service-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dLeyna \
pkgconfig(dleyna-core-1.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gupnp-1.6) \
pkgconfig(gupnp-av-1.0) \
pkgconfig(gupnp-dlna-2.0) \
pkgconfig(libsoup-3.0) \
pkgconfig(libxml-2.0)"

inherit rpm

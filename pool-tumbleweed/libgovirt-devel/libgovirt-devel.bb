SUMMARY = "Development files for the GObject-based oVirt bindings"
DESCRIPTION = "GoVirt is a GObject wrapper for the oVirt REST API [1]. It will \
only provide very basic functionality as the goal is to \
autogenerate a full wrapper as it is already done for the python \
bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.9"

RPM_NAME = "libgovirt-devel-0.3.9-1.3.aarch64.rpm"
RPM_HASH = "82f51e3720d5299677d6d9c491083e791fd43da2dc8764b9170b45d754b648cdafe24bd80749f9f8e7c179a90ace438d0a312bbf2968ae3ad0f05c347623555c"

RPROVIDES:${PN} += "libgovirt-devel \
pkgconfig-govirt-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgovirt2 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-rest-1.0 \
typelib-1-0-GoVirt-1-0"

inherit rpm

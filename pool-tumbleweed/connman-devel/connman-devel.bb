SUMMARY = "Development files for Connection Manager"
DESCRIPTION = "connman-devel contains development files for use with connman."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-devel-1.41-4.8.aarch64.rpm"
RPM_HASH = "89edf17ebe4bc2be7494242cb00c07045fd0cc39d61ca888d6bd0edb3abd9c14971c5b92442a3af349efe3fb7bcaa7188119d2906a0a174deafbccf4eb0d1386"

RPROVIDES:${PN} += "connman-devel \
pkgconfig-connman"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
connman \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0"

inherit rpm

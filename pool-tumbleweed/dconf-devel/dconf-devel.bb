SUMMARY = "Development files for dconf, a key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40.0"

RPM_NAME = "dconf-devel-0.40.0-3.4.aarch64.rpm"
RPM_HASH = "488200ee9cd5c5c4f7a2db900647b045548292a68dbf3f10e13ce93d5f9de6fa6331f7b83b30e357cd9f53d3de83494c198f6379c55b1a506a06c4a5adfb774a"

RPROVIDES:${PN} += "dconf-devel \
pkgconfig-dconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdconf1 \
pkgconfig-gio-2.0"

inherit rpm

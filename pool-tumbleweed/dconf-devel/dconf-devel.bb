SUMMARY = "Development files for dconf, a key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40.0"

RPM_NAME = "dconf-devel-0.40.0-3.3.aarch64.rpm"
RPM_HASH = "df5549dac66a59eeea35ab0f642ba96cb75e4a054563e18fa39a58af5f45cd0b190e0953d0b1462da8bc20ca2e653b633dd4ffd77adaf6ed65710876ac8af628"

RPROVIDES:${PN} += "dconf-devel \
dconf-devel(aarch-64) \
pkgconfig(dconf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdconf1 \
pkgconfig(gio-2.0)"

inherit rpm

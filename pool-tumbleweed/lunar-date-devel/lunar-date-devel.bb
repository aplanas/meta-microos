SUMMARY = "Chinese Lunar calendar library development files"
DESCRIPTION = "Development files for Chinese Lunar calendar library"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "lunar-date-devel-2.9.3-2.14.aarch64.rpm"
RPM_HASH = "6a27b5d4c65e56ce8194f6507b9cb4cfee8fec60a26c5a5359c3f7f473ceda0572d8d331de9f18f5c4ca04d78299f3baf93449430e8221f01976db94c9839205"

RPROVIDES:${PN} += "lunar-date-devel \
lunar-date-devel(aarch-64) \
pkgconfig(lunar-date-3.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblunar-date-3_0-1 \
pkgconfig(gio-2.0) \
typelib-1_0-LunarDate-3_0"

inherit rpm

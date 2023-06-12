SUMMARY = "Development tools for ibus"
DESCRIPTION = "The lunar-calendar-devel package contains the header files and developer \
docs for lunar-calendar."
LICENSE = "GPL-2.0+"

PV = "3.0.0+git20191124.f91a880"

RPM_NAME = "lunar-calendar-devel-3.0.0+git20191124.f91a880-1.15.aarch64.rpm"
RPM_HASH = "de72df7ce509669ea7b844c05bb66f0cc30afae673cbedb6c8392ab9113916a8914608854d1cf292156cf06c64e96baa018898f34db5822e522f36f7f91fff7c"

RPROVIDES:${PN} += "lunar-calendar-devel \
lunar-calendar-devel(aarch-64) \
pkgconfig(lunar-calendar-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblunar-calendar-3_0-1 \
pkgconfig(gtk+-3.0) \
pkgconfig(lunar-date-3.0)"

inherit rpm

SUMMARY = "Object Oriented Input System development package"
DESCRIPTION = "Object Oriented Input System (OIS) is a solution for using all kinds \
of Input Devices (Keyboards, Mice, Joysticks, etc) and feedback \
devices (e.g. forcefeedback)."
LICENSE = "Zlib"

PV = "1.5.1"

RPM_NAME = "libOIS-devel-1.5.1-1.8.aarch64.rpm"
RPM_HASH = "715088c963101fb0dbfeeee83b5108ead0e114b0348d0a471cded3e52a9bb6a54214fe89adfb510d79441682e468ea9de5d0411e6b09c10c01d12737f7507acd"

RPROVIDES:${PN} += "libOIS-devel \
libOIS-devel(aarch-64) \
pkgconfig(OIS)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOIS1_5_0"

inherit rpm

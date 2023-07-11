SUMMARY = "Object Oriented Input System development package"
DESCRIPTION = "Object Oriented Input System (OIS) is a solution for using all kinds \
of Input Devices (Keyboards, Mice, Joysticks, etc) and feedback \
devices (e.g. forcefeedback)."
LICENSE = "Zlib"

PV = "1.5.1"

RPM_NAME = "libOIS-devel-1.5.1-1.9.aarch64.rpm"
RPM_HASH = "cb4739cb255485c3875805dc266b4d5c19067c2d88ac4a32c50400d52a9a6f8699caa86e831232189dbdd4e986fe7d6a2bbcf4850128cc8935c8fbb44bf207d1"

RPROVIDES:${PN} += "libOIS-devel \
pkgconfig-OIS"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOIS1-5-0"

inherit rpm

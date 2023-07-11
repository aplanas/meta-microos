SUMMARY = "Header files for fifechan"
DESCRIPTION = "Development files, such as headers, needed when building packages using fifechan."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "fifechan-devel-0.1.5-1.20.aarch64.rpm"
RPM_HASH = "e2ee233b85cbe360b915513b21e4ab6f5fb5ffbaa881979d67e985b5f23406197787880c58baa256e1c6d8f231141e1468e22ef8680a7111ec6d5f8b8c138fd1"

RPROVIDES:${PN} += "fifechan-devel"

RDEPENDS:${PN} += "libfifechan-opengl0-1-5 \
libfifechan-sdl0-1-5 \
libfifechan0-1-5"

inherit rpm

SUMMARY = "Development Files for libburn"
DESCRIPTION = "Development files for developing applications using libisoburn."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "libisoburn-devel-1.5.4-1.11.aarch64.rpm"
RPM_HASH = "005effe6486ddcc0bfb359e1b767ef0635ca699f81083067027529de08419d0d5db156d4f2c05b687848ad98cc8cb06947c48246b221a8c4657db0ba92aec2c1"

RPROVIDES:${PN} += "libburnia-devel \
libisoburn-devel \
pkgconfig-libisoburn-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libburn-devel \
libisoburn1 \
libisofs-devel"

inherit rpm

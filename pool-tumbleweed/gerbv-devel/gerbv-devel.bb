SUMMARY = "Gerber File Viewer that supports the RS-274X Standard"
DESCRIPTION = "This package contains development files for developing applications \
that use gerbv library."
LICENSE = "GPL-2.0-only"

PV = "2.9.6"

RPM_NAME = "gerbv-devel-2.9.6-1.4.aarch64.rpm"
RPM_HASH = "4ac0d734556d51b21defc8426d647abbe643ed8c59668a9d27ed97c8a98238444377d87bd30b5dd6e1a73e9e012f6c48b7e1efc115134ad6add7d3b856fc3801"

RPROVIDES:${PN} += "gerbv-devel \
pkgconfig-libgerbv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-devel \
libgerbv1 \
libpng-devel \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0"

inherit rpm

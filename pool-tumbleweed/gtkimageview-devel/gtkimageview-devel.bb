SUMMARY = "Development files for gtkimageview"
DESCRIPTION = "GtkImageView is a widget that provides a zoomable and panable view of a \
GdkPixbuf. It is intended to be usable in most types of image viewing \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.6.4"

RPM_NAME = "gtkimageview-devel-1.6.4-22.22.aarch64.rpm"
RPM_HASH = "019fa7625d72a6d2e8c97ddfce3a8e9135a182b8e9461513b2adc2f0eadf1e2ebd14312044a15172bbb1964aa0cb326bc88119a6960bfef241c1f7beea5c45ff"

RPROVIDES:${PN} += "gtkimageview-devel \
libgtkimageview-devel \
pkgconfig-gtkimageview"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-devel \
libgtkimageview0 \
pkgconfig-gtk+-2.0"

inherit rpm

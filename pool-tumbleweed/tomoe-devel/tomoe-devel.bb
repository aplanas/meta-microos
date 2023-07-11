SUMMARY = "Header files for the Tomoe handwriting recognition engine"
DESCRIPTION = "Header files for the Tomoe handwriting recognition engine."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-devel-0.6.0-51.5.aarch64.rpm"
RPM_HASH = "13ab832adb01f2f5856be066c9386a46b324b3185e27b2797143d8f6bbb511b44b15a94017c2f818b36de5dc58dad2b9884c2fdc223583812857dd656231a78b"

RPROVIDES:${PN} += "pkgconfig-tomoe \
tomoe-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
pkgconfig-glib-2.0 \
tomoe"

inherit rpm

SUMMARY = "Support programs for Airspy"
DESCRIPTION = "A tiny and efficient software defined radio."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "airspy-1.0.10-1.8.aarch64.rpm"
RPM_HASH = "b1dd52d32792e3df7056ba7c61f1ed74cf2874e7e93fe15ec29c841524089863d78570a19be9a4f13991862dfee1bd530dab8e0cdda625a803266beb72321209"

RPROVIDES:${PN} += "airspy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libairspy.so.0 \
libc.so.6"

inherit rpm

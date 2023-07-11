SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "wireshark-devel-4.0.6-3.1.aarch64.rpm"
RPM_HASH = "c878a9593b3e21f0ac522e605ce2507fcce70a34a233a21c72266a2cd87c181ccbfeda97132695b73f3c018e1bad7887ad24993890edb932295485c0ce6bbe72"

RPROVIDES:${PN} += "ethereal-devel \
pkgconfig-wireshark \
wireshark-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
glibc-devel \
libwireshark16 \
libwiretap13 \
libwsutil14 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gthread-2.0 \
wireshark"

inherit rpm

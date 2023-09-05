SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.8"

RPM_NAME = "wireshark-devel-4.0.8-2.1.aarch64.rpm"
RPM_HASH = "fdb7f6511238b849e69c36e1dcc607a6a23a5da42a2e1dc6559ab21c555967aa2d49a71944c7852203898c697a49aba594e0b4b9f77063abfca848a34cb1346e"

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

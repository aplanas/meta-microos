SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.7"

RPM_NAME = "wireshark-devel-4.0.7-1.1.aarch64.rpm"
RPM_HASH = "f5e33d7721e84390fc1ba68ea57ebb52cee848f3e92b863261d28e9c14d42c204713a106c0653241d0880a3cedf457ded111eaaaf30bc61cca09161cebd3b359"

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

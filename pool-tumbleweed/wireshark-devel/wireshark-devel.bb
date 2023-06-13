SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "wireshark-devel-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "97246ae01fceb25ac795956dd630359a1a1a4fb93cc496a7389596a94f9dd7fe4f758d623110a8110d50bb53a8de2d4a45d9b6dfe27d9bba495a73d2f4d43691"

RPROVIDES:${PN} += "ethereal-devel \
pkgconfig(wireshark) \
wireshark-devel \
wireshark-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
glibc-devel \
libwireshark16 \
libwiretap13 \
libwsutil14 \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gthread-2.0) \
wireshark"

inherit rpm

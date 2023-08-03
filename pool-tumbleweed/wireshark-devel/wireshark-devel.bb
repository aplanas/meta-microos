SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.7"

RPM_NAME = "wireshark-devel-4.0.7-2.1.aarch64.rpm"
RPM_HASH = "05a44c0b32605cbe7600cd9d7de7b74bd61780bd3f5ab3c9fdf06141f1e27c65026dea48187a88403084f5330f85e5544a7f7b9fdafecec413ef4ed2fcc4e48f"

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

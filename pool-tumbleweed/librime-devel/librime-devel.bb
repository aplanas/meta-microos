SUMMARY = "Development files of Rime"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes. \
 \
This package is the development headers of Rime."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "librime-devel-1.7.3-2.19.aarch64.rpm"
RPM_HASH = "bd3416e1a3ee65c4ee3ae2b2a21ccc5ba9113f534e00d365760181d27916fe02e6cf02fc78eb73ffc05aaf83fc1c0bf53c3ab97a17f38eb62769baa1d8993ca6"

RPROVIDES:${PN} += "cmake-Rime \
librime-devel \
pkgconfig-rime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
rime"

inherit rpm

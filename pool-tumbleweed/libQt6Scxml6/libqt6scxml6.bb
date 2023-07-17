SUMMARY = "Qt 6 Scxml library"
DESCRIPTION = "The Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Scxml6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fb41b9feef79e2b5e40487b049009f955fd98f07e728f5ce094579a062d112c474a52def800a65e4c46f13ae0bdd01befc79f1e3203bf41eae853372c4b4ffac"

RPROVIDES:${PN} += "libQt6Scxml.so.6 \
libQt6Scxml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

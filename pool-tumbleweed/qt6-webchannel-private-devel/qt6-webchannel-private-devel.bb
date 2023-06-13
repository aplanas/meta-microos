SUMMARY = "Non-ABI stable API for the Qt 6 WebChannel library"
DESCRIPTION = "This package provides private headers of libQt6WebChannel that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webchannel-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "421dd8f31a07ec844f48113949ece72077026723ee9f1846b95314cde83cb2ea885bf9eac96f4cd528ab50639ec556c577c45180582049592b65ac98217637dd"

RPROVIDES:${PN} += "qt6-webchannel-private-devel \
qt6-webchannel-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6WebChannel) \
qt6-core-private-devel"

inherit rpm

SUMMARY = "Qt 6 QuickTimeline library"
DESCRIPTION = "The Qt 6 QuickTimeline library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6QuickTimeline6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "52f2e9bf430f666ae20798b214b71f2f4a554e11cddaacc3c5546388355a684b5e726de51b8136b36acf9dc38b1787db1f2164b02dd5b0a1b4c07d949a4770c6"

RPROVIDES:${PN} += "libQt6QuickTimeline.so.6 \
libQt6QuickTimeline6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

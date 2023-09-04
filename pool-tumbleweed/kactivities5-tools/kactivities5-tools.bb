SUMMARY = "Command-line tools for Plasma Activity management"
DESCRIPTION = "This package provides command-line tools to manipulate Plasma Activities."
LICENSE = "GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kactivities5-tools-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "016851904ab79f15753b759ed6af51d4a58fe73b7cf7c9a438ea0747ab0e7435b823b6cc79a45386c30b1f470a4ed485c8626a01e8a34f0f4018695d653b391f"

RPROVIDES:${PN} += "kactivities5-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Activities5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

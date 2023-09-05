SUMMARY = "Development files for wpewebkit"
DESCRIPTION = "WPE allows embedders to create simple and performant systems based on \
Web platform technologies. It is designed with hardware acceleration \
in mind, leveraging common 3D graphics APIs for best performance."
LICENSE = "BSD-3-Clause & LGPL-2.1"

PV = "2.40.3"

RPM_NAME = "wpewebkit-devel-2.40.3-1.2.aarch64.rpm"
RPM_HASH = "578c7be60e9594ad48dc5c3280ecb7f3af0eb1705d28ae56ff7d8f566ca396a181ad2a775fe4a89a20db6f8f33665eff302368d7e8909bf1ec74abc85c4c0c9c"

RPROVIDES:${PN} += "pkgconfig-wpe-web-process-extension-2.0 \
pkgconfig-wpe-webkit-2.0 \
wpewebkit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libWPEWebKit-2-0-1 \
pkgconfig-glib-2.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-wpe-1.0"

inherit rpm

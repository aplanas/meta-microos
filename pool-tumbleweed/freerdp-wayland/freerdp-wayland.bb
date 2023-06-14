SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the \
wayland-based client application."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-wayland-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "dcc8cc2180605194070acd5d7fe422e347afbd46a3ed78aef974f3937e5dee091f6599b5371cf3b4275cb0297276747370ca051eb3e6ab969b04cf0c396a76c2"

RPROVIDES:${PN} += "freerdp-wayland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-client2.so.2 \
libfreerdp2.so.2 \
libuwac0.so.0 \
libwinpr2.so.2"

inherit rpm

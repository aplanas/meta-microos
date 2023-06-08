SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the \
wayland-based client application."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-wayland-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "e7dd624b75238b49157a1c39b75dd61c3c71e75c817fb04b73094d78b433a300280d2d99b8e1c3de03468d2ee8e9af176d19074bd931ec4e467f2a99a489f0e9"

RPROVIDES:${PN} += "freerdp-wayland freerdp-wayland(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreerdp-client2.so.2()(64bit) libfreerdp2.so.2()(64bit) libuwac0.so.0()(64bit) libwinpr2.so.2()(64bit)"

inherit rpm

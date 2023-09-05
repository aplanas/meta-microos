SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the \
wayland-based client application."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "freerdp-wayland-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "c000ebec1eb9cff377c9a8e9d7b3b3bb15b77548b07e3b3c25f6d95091eae55762001b9f284dfe0511b4731bab90b2702e268f8631d6f9d9162ffca95598b78e"

RPROVIDES:${PN} += "freerdp-wayland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-client2.so.2 \
libfreerdp2.so.2 \
libuwac0.so.0 \
libwinpr2.so.2"

inherit rpm

SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the \
wayland-based client application."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-wayland-2.10.0-3.2.aarch64.rpm"
RPM_HASH = "930753d5e60c6edf82e077c9de9a784afec96e992f66b4e0f5c18d692fde2dca6b486ce5f9cfd53585e93ee898789d568bd6fca026acb0cfd8f6fd33f6cf155e"

RPROVIDES:${PN} += "freerdp-wayland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-client2.so.2 \
libfreerdp2.so.2 \
libuwac0.so.0 \
libwinpr2.so.2"

inherit rpm

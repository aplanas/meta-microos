SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the client \
application."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "freerdp-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "e34bc9448a4365ce6dacf30848f740914c96d761d1f8c009d65429adb3e740da6c4f901b5a7f1bf1816bc3d0c4934c7b26744ea0da6d24444a59d97abbe25e11"

RPROVIDES:${PN} += "freerdp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libfreerdp-client2.so.2 \
libfreerdp2-2 \
libfreerdp2.so.2 \
libwinpr2.so.2"

inherit rpm

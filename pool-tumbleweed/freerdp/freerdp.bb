SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the client \
application."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "a959f151ac3fed20bd3485955a1be410de374a50239a7af2b3d9c17a4af90d0ce22bf619a39662b4b9707ae87fd8b78e1cf7f1f43dde50f26f0a7926e4fc9c18"

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

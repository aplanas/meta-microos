SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the client \
application."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-2.10.0-3.2.aarch64.rpm"
RPM_HASH = "891234b806cd74e32f49986016fde5a09224ded89c76ba7c6da209c9b47ad89a33ed62c38331e4e66718e137ad8c49b1c5e06f5009aea24754fcd19f52b28ad1"

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

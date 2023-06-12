SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the client \
application."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "a959f151ac3fed20bd3485955a1be410de374a50239a7af2b3d9c17a4af90d0ce22bf619a39662b4b9707ae87fd8b78e1cf7f1f43dde50f26f0a7926e4fc9c18"

RPROVIDES:${PN} += "freerdp \
freerdp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreerdp-client2.so.2()(64bit) \
libfreerdp2-2 \
libfreerdp2.so.2()(64bit) \
libwinpr2.so.2()(64bit)"

inherit rpm

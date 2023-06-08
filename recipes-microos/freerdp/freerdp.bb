SUMMARY = "Remote Desktop Viewer Client"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the client \
application."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "0564d224ed2079f688207cda655806486868ce366af1df7a902c9499471886490883c83dab352280e93e079293cbf2c6b9a75250527b5ce1136dabd5e4f77dfb"

RPROVIDES:${PN} += "freerdp freerdp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXcursor.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXi.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreerdp-client2.so.2()(64bit) libfreerdp2-2 libfreerdp2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libwinpr2.so.2()(64bit)"

inherit rpm

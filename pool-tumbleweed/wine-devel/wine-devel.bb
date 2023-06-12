SUMMARY = "Files for Wine development"
DESCRIPTION = "This RPM contains the header files and development tools for the WINE \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "8.8"

RPM_NAME = "wine-devel-8.8-1.2.aarch64.rpm"
RPM_HASH = "d5e073de5efe82900e0fd7f992d23634ba63afda15e86c1aba3d0653db5e81f9ddc65096c0b4f9a812c88cbfb72d63d973a6ebfa4f2a1684bc0007aa2aa7eb23"

RPROVIDES:${PN} += "wine-devel \
wine-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libOSMesa.so.8()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libXxf86vm.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcups.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgnutls.so.30()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libkrb5.so.3()(64bit) \
libv4l2.so.0()(64bit) \
libvulkan.so.1()(64bit)"

inherit rpm

SUMMARY = "Files for Wine development"
DESCRIPTION = "This RPM contains the header files and development tools for the WINE \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "8.15"

RPM_NAME = "wine-devel-8.15-1.2.aarch64.rpm"
RPM_HASH = "65ebe5bf504aed082523f3bdeeafd41c0a360ed46ad4c3be8f3fc9c30ecc8dadedcea0299c678528ca95e4b2b25dbd8daf591705dc59830067a4dc43bc10b53e"

RPROVIDES:${PN} += "wine-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libOSMesa.so.8 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libv4l2.so.0 \
libvulkan.so.1"

inherit rpm

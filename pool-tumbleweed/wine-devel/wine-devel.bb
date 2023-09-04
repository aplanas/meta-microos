SUMMARY = "Files for Wine development"
DESCRIPTION = "This RPM contains the header files and development tools for the WINE \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "8.14"

RPM_NAME = "wine-devel-8.14-1.2.aarch64.rpm"
RPM_HASH = "ce819472f78e5ee975d299269115f9a5be5776436929ea7cd0253e5fd297b09cf27c2fbe1c5401bb296cd14713f2982c39de1f71b04fc7e2560ef8b6332bf4a9"

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

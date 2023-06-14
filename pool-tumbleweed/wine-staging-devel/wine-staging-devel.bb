SUMMARY = "Files for Wine development"
DESCRIPTION = "This RPM contains the header files and development tools for the WINE \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "6.17"

RPM_NAME = "wine-staging-devel-6.17-1.1.aarch64.rpm"
RPM_HASH = "db1254c63d42ebf16a285522690420f3da5b2a3182f747cb7299f2acb960354f94b6e141673b8cc53cf10b240c81ccc5181e369f3ee82f58189b7939b3b1eec3"

RPROVIDES:${PN} += "wine-devel \
wine-staging-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libFAudio.so.0 \
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
libgcrypt.so.20 \
libgnutls.so.30 \
libgsm.so.1 \
libgssapi-krb5.so.2 \
libjpeg.so.8 \
libkrb5.so.3 \
libopenal.so.1 \
libpng16.so.16 \
libsane.so.1 \
libtiff.so.5 \
libv4l2.so.0 \
libvkd3d-shader.so.1 \
libvkd3d.so.1 \
libvulkan.so.1 \
libxslt.so.1"

inherit rpm

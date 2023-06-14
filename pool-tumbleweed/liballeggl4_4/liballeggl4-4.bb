SUMMARY = "Allegro OpenGL bindings"
DESCRIPTION = "This library allows to use OpenGL from Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeggl4_4-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "73be861e0ceb6227615aab0b8c9c25320c3ef482b742b130eea07f948de18260eb3f887bac0b62f1cb206aa18495f5a4fa5c7d987cfb172bfbd7e4af7e6b6658"

RPROVIDES:${PN} += "liballeggl.so.4.4 \
liballeggl4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXpm.so.4 \
libXxf86vm.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libm.so.6"

inherit rpm

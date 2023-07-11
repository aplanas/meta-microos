SUMMARY = "Allegro OpenGL bindings"
DESCRIPTION = "This library allows to use OpenGL from Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeggl4_4-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "7387173e812336957ad1efb4d6656a3ae03b594bbcf16642b246709085aa9bedc4f2ac285d20723aa7f9f68feaf1cf6a9484c79f9ec03a52a172997ebfe2e7a8"

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

SUMMARY = "Java bindings for the OpenGL API"
DESCRIPTION = "The JOGL project hosts the development version of the Java Binding for \
the OpenGL API, and is designed to provide hardware-supported 3D graphics \
to applications written in Java. \
 \
JOGL provides full access to the APIs in the OpenGL 1.3 - 3.0, 3.1 - 3.3, \
≥ 4.0, ES 1.x and ES 2.x specification as well as nearly all vendor \
extensions. OpenGL Evolution & JOGL (UML) gives you a brief overview \
of OpenGL, its profiles and how we map them to JOGL."
LICENSE = "BSD-2-Clause"

PV = "2.3.2"

RPM_NAME = "jogl2-2.3.2-11.8.aarch64.rpm"
RPM_HASH = "07dfcd6a46be56a7fe11e03be1f7038f5398840d1d2270caef66013b85a773f4e40803c253f4476aeacaf41ccd81437cf38c53407882462b888880a5c897433d"

RPROVIDES:${PN} += "jogl2 \
libjogl-cg.so \
libjogl-desktop.so \
libjogl-mobile.so \
libnativewindow-awt.so \
libnativewindow-x11.so \
libnewt.so"

RDEPENDS:${PN} += "gluegen2 \
java \
jpackage-utils \
libX11.so.6 \
libXcursor.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libjawt.so"

inherit rpm

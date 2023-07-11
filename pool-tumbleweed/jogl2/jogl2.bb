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

RPM_NAME = "jogl2-2.3.2-11.10.aarch64.rpm"
RPM_HASH = "181183c4c020f873188bdab069f00f465bdcc7d5f80eafe0b9315fbc0881a55b740325caac307b26b760df9e31195b3ccf4874bda6c632148503f2b9f9226403"

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

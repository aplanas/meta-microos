SUMMARY = "Modern version of the classic arcade Game"
DESCRIPTION = "Asteroid (just one!) is a modern version of the arcade classic Asteroids, \
using OpenGL, GLUT, and optionally GTK and SDL_mixer. \
It features a variety of powerups, taunting aliens, 3D textured asteroids, \
face-melting sound effects, and infinite playability."
LICENSE = "GPL-3.0"

PV = "1.2.1"

RPM_NAME = "asteroid-1.2.1-3.24.aarch64.rpm"
RPM_HASH = "68e782e99ec1d8507fb84efdf143793b35c3388aa81443db9909563c85582bf6a1ec9d41491a28dab1ee904c435b391a90aa4217a98ed5fd21e11a52685416e0"

RPROVIDES:${PN} += "application() \
application(asteroid.desktop) \
asteroid \
asteroid(aarch-64)"

RDEPENDS:${PN} += "libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libglut.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm

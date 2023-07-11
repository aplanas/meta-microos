SUMMARY = "Persistence of Vision Raytracer"
DESCRIPTION = "The Persistence of Vision Ray tracer creates three-dimensional, \
photo-realistic images using a rendering technique called ray tracing. \
It reads in a text file containing information describing the objects \
and lighting in a scene and generates an image of that scene from the \
view point of a camera also described in the text file. Ray tracing is \
not a fast process by any means, (the generation of a complex image can \
take several hours) but it produces very high quality images with \
realistic reflections, shading, perspective, and other effects."
LICENSE = "AGPL-3.0-or-later & CC-BY-SA-3.0"

PV = "3.7.0.10"

RPM_NAME = "povray-3.7.0.10-1.10.aarch64.rpm"
RPM_HASH = "f435da8eb40c90e78263cba557e2310e2d24dfe689d18c96c2d486f25fb038398a7d7cb1526d478ddcad6d67c4260094b75a75778ec1c39a4607ebb5d6209428"

RPROVIDES:${PN} += "config-povray \
povray"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libOpenEXR-3-1.so.30 \
libSDL-1.2.so.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm

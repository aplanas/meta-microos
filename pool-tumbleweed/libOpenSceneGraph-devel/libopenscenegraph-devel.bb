SUMMARY = "OpenSceneGraph development files"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the header and development files for \
OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "libOpenSceneGraph-devel-3.6.5-8.7.aarch64.rpm"
RPM_HASH = "13c57ec6ddc0f55bc23c049b37e4f5f3d0ffdda150c0e0f2366f9ad1ccc3dbf3dd999ca16ba47b97436c63be935b196d731b0ad5401091448ff5c6b9251e1701"

RPROVIDES:${PN} += "libOpenSceneGraph-devel \
pkgconfig-openscenegraph \
pkgconfig-openscenegraph-osg \
pkgconfig-openscenegraph-osgAnimation \
pkgconfig-openscenegraph-osgDB \
pkgconfig-openscenegraph-osgFX \
pkgconfig-openscenegraph-osgGA \
pkgconfig-openscenegraph-osgManipulator \
pkgconfig-openscenegraph-osgParticle \
pkgconfig-openscenegraph-osgShadow \
pkgconfig-openscenegraph-osgSim \
pkgconfig-openscenegraph-osgTerrain \
pkgconfig-openscenegraph-osgText \
pkgconfig-openscenegraph-osgUtil \
pkgconfig-openscenegraph-osgViewer \
pkgconfig-openscenegraph-osgVolume \
pkgconfig-openscenegraph-osgWidget"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
curl-devel \
freeglut-devel \
giflib-devel \
libOpenSceneGraph161 \
libOpenThreads-devel \
libjpeg-devel \
libpng-devel \
pkgconfig-freetype2 \
pkgconfig-librsvg-2.0 \
pkgconfig-libtiff-4 \
pkgconfig-openscenegraph-osg \
pkgconfig-openscenegraph-osgDB \
pkgconfig-openscenegraph-osgGA \
pkgconfig-openscenegraph-osgText \
pkgconfig-openscenegraph-osgUtil \
pkgconfig-openscenegraph-osgViewer \
pkgconfig-openthreads \
pkgconfig-poppler-glib \
pkgconfig-sdl2 \
pkgconfig-xrandr"

inherit rpm

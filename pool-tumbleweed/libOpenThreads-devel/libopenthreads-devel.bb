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

RPM_NAME = "libOpenThreads-devel-3.6.5-8.7.aarch64.rpm"
RPM_HASH = "93473fb205c9893a862518e68ffa7ffb8ff74cb0719b9f972f6030496e85885f892610021817422d6b8b40ee9171c46dc45351dee7491eeb4e5d95cb9f036570"

RPROVIDES:${PN} += "libOpenThreads-devel \
pkgconfig-openthreads"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOpenThreads21"

inherit rpm

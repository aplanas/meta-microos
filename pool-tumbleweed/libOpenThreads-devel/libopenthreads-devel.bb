SUMMARY = "OpenSceneGraph development files"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the header and development files for \
OpenSceneGraph."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "libOpenThreads-devel-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "4f9e0528c18f4df03a45e27e16839a3fbf0365d528173952aa5db9c5dc2d7afe009537dd6519431c19023bfdabe9afe1f064f8997d223a83b90a262a26b88671"

RPROVIDES:${PN} += "libOpenThreads-devel \
libOpenThreads-devel(aarch-64) \
pkgconfig(openthreads)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOpenThreads21"

inherit rpm
